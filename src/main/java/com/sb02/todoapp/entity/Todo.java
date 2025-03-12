package com.sb02.todoapp.entity;


import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class Todo {
    private UUID id;
    private String name;
    private String description;
}
