package com.sb02.todoapp.application;

import com.sb02.todoapp.domain.Todo;
import java.util.UUID;

public record TodoDto(UUID id, String name, String content) {
    public static TodoDto fromEntity(Todo todo) {
        return new TodoDto(todo.getId(), todo.getName(), todo.getContent());
    }
}
