package com.example.messaging.auth;

import feign.Headers;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "auth",url = "https://kauth.kakao.com/oauth/token")
public interface Auth {
    @Headers(value = {"Content-Type: application/x-www-form-urlencoded", "charset: utf-8"})
    @PostMapping
    AuthResponseDto login( @RequestParam("grant_type") String grantType,
                           @RequestParam("client_id") String clientId,
                           @RequestParam("redirect_uri") String redirectUri,
                           @RequestParam("code") String code);
}
