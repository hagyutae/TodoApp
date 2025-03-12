package com.sb02.todoapp.controller;

import com.sb02.todoapp.dto.TodoRequestDto;
import com.sb02.todoapp.dto.TodoResponseDto;
import com.sb02.todoapp.dto.TodosResponseDto;
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

    @GetMapping()
    public TodosResponseDto getAllTodos() {
        List<TodoResponseDto> todos = todoService.getAllTodos();
        return new TodosResponseDto(todos);
    }

    @PostMapping()
    public TodoResponseDto addTodo(@RequestBody TodoRequestDto todoRequestDto) {
        return todoService.addTodo(todoRequestDto);
    }
}
