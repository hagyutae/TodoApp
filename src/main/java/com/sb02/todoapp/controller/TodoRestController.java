package com.sb02.todoapp.controller;

import com.sb02.todoapp.Todo;
import com.sb02.todoapp.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {

    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }
    //전체목록 반환
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
    //저장
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.saveTodo(todo);
    }
}
