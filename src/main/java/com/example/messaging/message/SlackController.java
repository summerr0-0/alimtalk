package com.example.messaging.message;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/slack")
public class SlackController {

    private final SlackMessage slackMessage;

    @GetMapping
    public void send(){
        log.info("slackSend");
        slackMessage.noti();
    }

    @PostMapping(value = "/list")
    public void show(){
        log.info("slackSend");
        slackMessage.noti();
    }

    @PostMapping(
            value = "/add",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void add(@RequestParam String text){
        log.info("slackAdd");
        log.info(text);

        slackMessage.add("asd");
    }
}
