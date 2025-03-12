package com.sb02.todoapp.controller;

import java.util.UUID;

public record TodoResponseDto(UUID id,String name,String description) {
}
