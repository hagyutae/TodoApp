package com.sb02.todoapp.dto;

import java.util.UUID;

public record CreateTodoRequestDTO(
        UUID id,
        String name,
        String description
) {
}
