package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoRestController {
    private final TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getTodoList();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        todoService.createTodo(todo);
        return todo;
    }
}
