package com.sb02.todoapp.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class TodoResponseDto {
    private UUID id;
    private String name;
    private String description;
}
