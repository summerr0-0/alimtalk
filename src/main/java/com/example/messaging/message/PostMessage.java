package com.example.messaging.message;

import com.example.messaging.kakao.message.Template;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "postMessage", url = "https://slack.com/api/chat.postMessage")
public interface PostMessage {
    @PostMapping(
            headers = {"Content-Type= application/x-www-form-urlencoded"}
    )
    String send(
            @RequestHeader("Authorization") String token,
            @RequestParam String channel,
            @RequestParam String text
    );
}
