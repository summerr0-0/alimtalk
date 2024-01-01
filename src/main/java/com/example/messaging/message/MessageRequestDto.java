package com.example.messaging.message;

public record MessageRequestDto(

        String[] receiver_uuids,
        Template template_object
) {
}
