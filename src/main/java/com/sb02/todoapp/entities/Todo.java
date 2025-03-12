package com.sb02.todoapp.entities;

import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
public class Todo {
    private final UUID id;
    private final String name;
    private final String description;
    private final ZonedDateTime createdAt;

    public Todo(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.createdAt = ZonedDateTime.now();
    }
}
