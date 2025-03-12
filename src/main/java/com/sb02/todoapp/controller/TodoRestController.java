package com.sb02.todoapp.controller;

import com.sb02.todoapp.model.ToDo;
import com.sb02.todoapp.model.ToDos;
import com.sb02.todoapp.service.TodoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {

    private final TodoService todoService;

    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/api/todos")
    public ResponseEntity<ToDo> registerTodo(@RequestBody ToDo toDo){
        return ResponseEntity.ok(todoService.registerTodo(toDo));
    }

    @GetMapping("/api/todos")
    public ResponseEntity<ToDos> getAllTodos(){
        return ResponseEntity.ok(todoService.getAllTodos());
    }
}
