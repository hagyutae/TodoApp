package com.sb02.todoapp.domain;

import java.util.UUID;

public class Todo {
    private final UUID id;
    private final String name;
    private final String description;

    public Todo(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public UUID getId() {
        return id;
    }
}
