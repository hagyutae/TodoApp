package com.sb02.todoapp.controller;

import com.sb02.todoapp.model.Todo;
import com.sb02.todoapp.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        return ResponseEntity.ok(Map.of("message", "성공"));
    }

    @GetMapping
    public ResponseEntity<Map<String, List<Todo>>> getTodos() {
        List<Todo> todos = todoService.getTodos();
        return ResponseEntity.ok(Map.of("todos", todos));
    }
}
