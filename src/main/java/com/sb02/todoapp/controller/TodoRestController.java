package com.sb02.todoapp.controller;

import com.sb02.todoapp.application.TodoCreationDto;
import com.sb02.todoapp.application.TodoDto;
import com.sb02.todoapp.application.TodosDto;
import com.sb02.todoapp.service.TodoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {
    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/api/todos")
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoCreationDto todoCreationDto) {
        return ResponseEntity.ok(todoService.createTodo(todoCreationDto));
    }

    @GetMapping("/api/todos")
    public ResponseEntity<TodosDto> findAll() {
        return ResponseEntity.ok(todoService.findAll());
    }
}
