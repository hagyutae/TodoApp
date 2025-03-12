package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public ResponseEntity<Todo> save(@RequestBody Todo todo) {
        todoService.save(todo);
        return ResponseEntity.ok(todo);
    }

    @GetMapping
    public ResponseEntity<Map<String, List<Todo>>> getData() {
        List<Todo> data = todoService.getData();
        Map<String, List<Todo>> response = new HashMap<>();
        response.put("todos", data);
        return ResponseEntity.ok(response);
    }

}
