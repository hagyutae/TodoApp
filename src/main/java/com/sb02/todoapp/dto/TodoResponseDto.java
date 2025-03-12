package com.sb02.todoapp.dto;

import com.sb02.todoapp.entity.Todo;

public record TodoResponseDto(
        String id,
        String name,
        String description
) {
    public static TodoResponseDto fromEntity(Todo todo) {
        return new TodoResponseDto(todo.getId(), todo.getName() ,todo.getDescription());
    }
}
