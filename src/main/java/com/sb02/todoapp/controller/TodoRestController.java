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

    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        todoService.save(todo);
        return todo;
    }

    @GetMapping
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }

}
