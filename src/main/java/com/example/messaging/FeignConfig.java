package com.example.messaging;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

//    @Bean
//    public feign.RequestInterceptor requestInterceptor() {
//        Map<String, Collection<String>> headerMap = new HashMap<>();
//        headerMap.put("Content-Type", Collections.singleton("application/x-www-form-urlencoded"));
//        headerMap.put("charset", Collections.singleton("utf-8"));
//        return requestTemplate -> requestTemplate.headers(headerMap);
//
//    }

}
