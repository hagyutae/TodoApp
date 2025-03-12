package com.sb02.todoapp.controller;

import com.sb02.todoapp.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TodoPageController {
    @GetMapping("/todos")
    public String getTodosPage() {
        return "todos";  // templates/todos.html 파일을 렌더링
    }
}
