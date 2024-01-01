package com.example.messaging.message;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "message", url = "https://kapi.kakao.com/v1/api/talk/friends/message/default/send")
public interface Message {
    @PostMapping(produces = "application/json",
            headers = {
                    "Content-Type= application/x-www-form-urlencoded",
            })
    String send(
            @RequestHeader("Authorization") String accessToken,
            @RequestParam String[] receiver_uuids,
            @RequestParam Template template_object

            );
}
