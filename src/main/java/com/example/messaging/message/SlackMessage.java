package com.example.messaging.message;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SlackMessage implements MessageSystem{

    private final PostMessage postMessage;
    private final String slackBotToken = "Bearer xoxb-6458036336486-6487651721568-ekBOnH5ZxU7XTeKn4GCunmOx";
    private final String channel = "C06DRBBUTEY";


    public void noti(){
        String send = postMessage.send(
                slackBotToken,
                channel,
                "--오늘할일--"
        );

        log.info(send);
    }

    @Override
    public void add(String msg) {


    }

    public void take() {

    }
}
