package com.example.messaging;

import com.example.messaging.auth.Auth;
import com.example.messaging.auth.AuthResponseDto;
import com.example.messaging.auth.Grant;
import com.example.messaging.friends.Friends;
import com.example.messaging.message.Link;
import com.example.messaging.message.Message;
import com.example.messaging.message.MessageRequestDto;
import com.example.messaging.message.Template;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final Message message;
    private final Auth auth;
    private final Friends friends;
    private final Grant grant;

    @GetMapping
    public String send() {

        //인증
        AuthResponseDto result = auth.login(
                "authorization_code",
                "",
                "http://localhost:8080",
                ""
        );

        log.info(result.access_token());
        String accessToken = "Bearer " + result.access_token();
        //친구목록
        String searchFriends = friends.get(accessToken);

        log.info(searchFriends);

        //메시지 전송
        message.send(
                "Bearer " + result.access_token(),
                new String[]{""},
                new Template(
                        "text",
                        "안녕하세용",
                        new Link("https://www.google.com")
                )
        );
        return "";
    }
}
