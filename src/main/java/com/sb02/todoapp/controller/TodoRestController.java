package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoService todoService;

    public TodoRestController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<Map<String, List<Todo>>> getAllTodos(){
        List<Todo> todos = todoService.getAllTodos();
        Map<String, List<Todo>> res = new HashMap<>();
        res.put("todos", todos);
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createTodo(@RequestBody Map<String, String> res){
        String name = res.get("name");
        String description = res.get("description");
        todoService.createTodo(name, description);
        Map<String, String> resMap = new HashMap<>();
        return ResponseEntity.ok(resMap);
    }

}
