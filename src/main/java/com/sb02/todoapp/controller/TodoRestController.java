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
    public ResponseEntity<Map<String,String>> writeList(@RequestBody TodoCreateDTO todoCreateDTO) {
        todoService.write(todoCreateDTO.name(), todoCreateDTO.description());
        Map<String, String> response = new HashMap<>();
        response.put(todoCreateDTO.name(), todoCreateDTO.description());
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Map<String,List<Todo>>> getTodos() {
        List<Todo> todo = todoService.getTodo();
        Map<String, List<Todo>> response = new HashMap<>();
        response.put("todos", todo);
        return ResponseEntity.ok(response);
    }
}
