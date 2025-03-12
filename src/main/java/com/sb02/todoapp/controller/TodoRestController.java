package com.sb02.todoapp.controller;


import com.sb02.todoapp.Entity.Todo;
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
    public List<Todo> getTodos(){
        List<Todo> todos = todoService.getAll();
        System.out.println("서버에서 반환하는 TODO 목록: " + todos); // 📌 서버 로그 확인
        return todoService.getAll();
    }

    @PostMapping
    public Todo addTodos(@RequestBody Todo todo){
        todoService.addTodo(todo);
        return todo;
    }
}
