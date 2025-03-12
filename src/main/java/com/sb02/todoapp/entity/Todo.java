package com.sb02.todoapp.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Todo {
    private UUID id;
    private String name;
    private String description;

    public Todo(String name, String description){
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }
}