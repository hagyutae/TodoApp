package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import com.sb02.todoapp.service.TodoService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TodoRestController {
    private final TodoService todoService;

    @GetMapping("/todos")
    public Map<String, List<Todo>> todos(){
        List<Todo> todos = todoService.findAll(); // 모든 Todo 목록 가져오기
        Map<String, List<Todo>> response = new HashMap<>();
        response.put("todos", todos);
        return response;
    }

    @PostMapping("/todos")
    public Map<String, List<Todo>> createTodo(
            @RequestBody Todo todo){

        todoService.create(todo);

        return todos();
    }

    @PostConstruct
    public void init(){
        todoService.create(new Todo("이름", "타이틀"));
        todoService.create(new Todo("이름1", "타이틀2"));
    }
}
