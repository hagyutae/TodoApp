package com.sb02.todoapp.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Builder
public class TodoCreateResponseDto {
    private UUID id;
    private String name;
    private String description;
}
