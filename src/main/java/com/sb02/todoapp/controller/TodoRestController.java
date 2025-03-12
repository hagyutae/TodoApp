package com.sb02.todoapp.controller;

import com.sb02.todoapp.dto.TodoCreateRequestDto;
import com.sb02.todoapp.dto.TodoCreateResponseDto;
import com.sb02.todoapp.dto.TodoListResponseDto;
import com.sb02.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoRestController {
    private final TodoService todoService;

    @PostMapping
    public TodoCreateResponseDto create(@RequestBody TodoCreateRequestDto todoCreateRequestDto) {
        return todoService.create(todoCreateRequestDto);
    }

    @GetMapping
    public TodoListResponseDto getAllTodos() {
        return todoService.getAllTodos();
    }
}
