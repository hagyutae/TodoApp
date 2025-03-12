package com.sb02.todoapp;

public class Todo {
    private String name;
    private String description;

    public Todo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
