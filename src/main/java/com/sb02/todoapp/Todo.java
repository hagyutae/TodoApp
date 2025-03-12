package com.sb02.todoapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private UUID id;
    private String name;
    private String description;

    public Todo(String name, String description) {
        this.name = name;
        this.description = description;
    }
} 