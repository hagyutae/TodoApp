package com.sb02.todoapp.controller;

import com.sb02.todoapp.application.TodoCreationDto;
import com.sb02.todoapp.application.TodoDto;
import com.sb02.todoapp.application.TodosDto;
import com.sb02.todoapp.service.TodoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoServiceImpl todoService;

    public TodoRestController(TodoServiceImpl todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoCreationDto todoCreationDto) {
        return ResponseEntity.ok(todoService.createTodo(todoCreationDto));
    }

    @GetMapping
    public ResponseEntity<TodosDto> findAll() {
        return ResponseEntity.ok(todoService.findAll());
    }
}
