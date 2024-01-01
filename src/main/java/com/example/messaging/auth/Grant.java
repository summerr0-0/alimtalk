package com.example.messaging.auth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "grant",url = "https://kauth.kakao.com/oauth/authorize?client_id=\"\"&redirect_uri=http://localhost:8080&response_type=code&scope=talk_message,friends")
public interface Grant {
    @GetMapping
    String get();
}
