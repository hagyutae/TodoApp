package com.sb02.todoapp.domain;

import java.util.UUID;
import lombok.Getter;

@Getter
public class Todo {
    private final UUID id;
    private final String name;
    private final String description;
    private final Long createdAt;

    public Todo(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.createdAt = System.currentTimeMillis();
    }
}
