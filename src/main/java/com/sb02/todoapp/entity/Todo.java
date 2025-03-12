package com.sb02.todoapp.entity;

import lombok.Getter;

@Getter
public class Todo {
    private final Long id;
    private String name;
    private String description;

    public Todo(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
