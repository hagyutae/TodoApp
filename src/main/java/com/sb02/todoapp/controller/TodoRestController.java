package com.sb02.todoapp.controller;

import com.sb02.todoapp.dto.TodoResponseDto;
import com.sb02.todoapp.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoRestController {

    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos")
    public List<TodoResponseDto> getAllTodos() {
        return todoService.getAllTodos();
    }
}
