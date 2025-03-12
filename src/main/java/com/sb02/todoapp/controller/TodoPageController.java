package com.sb02.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoPageController {
    @GetMapping("/todos")
    public void getTodosPage() {}
}
