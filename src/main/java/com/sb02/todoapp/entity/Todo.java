package com.sb02.todoapp.entity;


import lombok.Getter;

import java.util.UUID;

@Getter
public class Todo {
    private final String name;
    private final String description;

    public Todo(String name, String description){
        this.name = name;
        this.description = description;
    }

}
