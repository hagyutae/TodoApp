package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoRestController {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        List<Todo> todos = todoService.getAllTodos();
        return ResponseEntity.ok().body(Collections.singletonMap("todos", todos));
    }

    @PostMapping
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        Todo createdTodo = todoService.addTodo(todo);
        return ResponseEntity.ok(createdTodo);
    }
}
