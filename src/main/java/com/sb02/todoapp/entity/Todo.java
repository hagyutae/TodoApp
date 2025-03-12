package com.sb02.todoapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class Todo {
    private UUID id;
    private String name;
    private String description;

    public Todo(String name, String description) {
        this.id = UUID.randomUUID(); // UUID 자동 생성
        this.name = name;
        this.description = description;
    }

    public void updateTodo(String name, String description) {
        this.name = name;
        this.description = description;
    }
}