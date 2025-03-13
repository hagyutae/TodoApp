package com.sb02.todoapp.controller;

import jakarta.validation.constraints.NotBlank;

public record CreateRequest(
        @NotBlank String name,
        String description
) {
}
