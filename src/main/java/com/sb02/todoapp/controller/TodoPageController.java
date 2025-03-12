package com.sb02.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.sb02.todoapp.service.TodoService;

@Controller
public class TodoPageController {

    private final TodoService todoService;

    public TodoPageController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos")
    public String getTodosPage(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "todos";  // templates/todos.html 렌더링
    }
}
