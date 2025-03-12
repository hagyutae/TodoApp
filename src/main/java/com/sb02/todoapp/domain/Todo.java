package com.sb02.todoapp.domain;

import java.util.UUID;

public class Todo {
    private final UUID id;
    private final String name;
    private final String content;

    public Todo(String name, String content) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public UUID getId() {
        return id;
    }
}
