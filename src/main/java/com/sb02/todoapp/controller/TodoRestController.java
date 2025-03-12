package com.sb02.todoapp.controller;

import com.sb02.todoapp.Todo;
import com.sb02.todoapp.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public Map<String, Object> getTodos() {
        List<Todo> todos = todoService.getTodos();
        Map<String, Object> response = new HashMap<>();
        response.put("todos", todos);
        return response;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> addTodo(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        String description = request.get("description");
        todoService.addTodo(name, description);

        return ResponseEntity.ok(new HashMap<>());
    }
}
