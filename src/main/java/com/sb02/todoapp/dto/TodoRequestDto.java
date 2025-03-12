package com.sb02.todoapp.dto;

import com.sb02.todoapp.entity.Todo;

public record TodoRequestDto(
        String name,
        String description
) {
    public Todo toEntity() {
        return new Todo(name, description);
    }
}