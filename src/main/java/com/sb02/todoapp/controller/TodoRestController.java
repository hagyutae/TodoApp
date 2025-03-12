package com.sb02.todoapp.controller;

import org.springframework.web.bind.annotation.*;
import com.sb02.todoapp.service.TodoService;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public Map<String, List<Map<String, String>>> getAllTodos(){
        return Map.of("todos", todoService.getAllTodos());
    }


    @PostMapping
    public Map<String, String> createTodo(@RequestBody Map<String, String> todo){
        todoService.createTodo(todo);
        return todo;
    }
}
