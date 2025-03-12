package com.sb02.todoapp.controller;

import com.sb02.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoService todoService;

    @Autowired
    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Map<String, String>> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping
    public Map<String, String> creatTodo(@RequestBody Map<String, String> todoData) {
        return todoService.creatTodo(todoData);
    }
}
