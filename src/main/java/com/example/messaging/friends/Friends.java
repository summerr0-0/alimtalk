package com.example.messaging.friends;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "friends",url = "https://kapi.kakao.com/v1/api/talk/friends")
public interface Friends {
    @GetMapping
    String get(@RequestHeader("Authorization") String accessToken);
}
