package com.sb02.todoapp.entity;

public class Todo {
    private Long id;
    private String name;
    private String description;

    public Todo(Long id, String title, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setCompleted(String description) { this.description = description; }
}
