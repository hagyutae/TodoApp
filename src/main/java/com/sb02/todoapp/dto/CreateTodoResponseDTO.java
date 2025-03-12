package com.sb02.todoapp.dto;

import lombok.Data;

import java.util.UUID;


public record CreateTodoResponseDTO(
        UUID id,
        String name,
        String description
) {
}
