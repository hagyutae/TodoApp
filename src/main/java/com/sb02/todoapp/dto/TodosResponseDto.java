package com.sb02.todoapp.dto;

import java.util.List;

public record TodosResponseDto(
        List<TodoResponseDto> todos
) {
}
