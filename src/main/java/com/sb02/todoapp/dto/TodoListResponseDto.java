package com.sb02.todoapp.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class TodoListResponseDto {
    private List<TodoResponseDto> todos;
}
