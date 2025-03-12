package com.sb02.todoapp.controller;


import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoServiceMpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoServiceMpl todoService;

    public TodoRestController(TodoServiceMpl todoService){
        this.todoService = todoService;
    }


    @GetMapping
    public List<Todo> getTodos(){
        return todoService.listAllTodo();
    }

    @PostMapping
    public Todo newTodo(@RequestBody Todo newTodo){
        todoService.createTodo(newTodo);
        return newTodo;
    }
}
