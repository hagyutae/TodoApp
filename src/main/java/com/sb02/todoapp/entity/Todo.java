package com.sb02.todoapp.entity;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Todo {
    private UUID id;
    private String name;
    private String description;
    private LocalDateTime createdAt;

    public Todo(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }

}
