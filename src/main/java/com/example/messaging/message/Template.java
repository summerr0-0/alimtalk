package com.example.messaging.message;

public record Template(
        String object_type,
        String text,
        Link link
) {
}

