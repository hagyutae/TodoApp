package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.TodoEntity;
import com.sb02.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todos")
public class TodoRestController {

    private final TodoService todoService;

    @PostMapping
    public TodoEntity createTodo(@RequestBody Map<String, String> request){
        String name = request.get("name");
        String description = request.get("description");
        todoService.save(name, description);
        return new TodoEntity(name, description);
    }

    @GetMapping
    public Map<String, List<TodoEntity>> getTodos() {
        return todoService.findAll();
    }
}
