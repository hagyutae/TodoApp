package com.sb02.todoapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TodoEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final UUID id = UUID.randomUUID();
    private String name;
    private String description;
}
