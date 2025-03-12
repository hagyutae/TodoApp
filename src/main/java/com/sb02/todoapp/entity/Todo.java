package com.sb02.todoapp.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Todo {
    private String id;
    private String name;
    private String description;

    public Todo(String name, String description) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
    }
}
