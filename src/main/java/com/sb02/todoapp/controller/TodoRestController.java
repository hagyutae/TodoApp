package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodos() {
        // todo 정보가 있는 List 반환
        return todoService.getAllTodos();
    }

    @PostMapping
    public List<Todo> createTodo(@RequestBody Todo todo) {
        // todo 정보 추가
        return todoService.createTodo(todo);
    }
}
