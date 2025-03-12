package com.sb02.todoapp.controller;


import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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
    public Map<String, List<Todo>> getTodos() {
        return Collections.singletonMap("todos", todoService.getAllTodos());
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo.getName(), todo.getDescription());
        return todo;
    }
}
