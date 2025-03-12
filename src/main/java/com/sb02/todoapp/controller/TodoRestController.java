package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoRestController {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getTodos() {
        List<Todo> todos = todoService.getAllTodos();

        Map<String, Object> response = new HashMap<>();
        response.put("todos", todos);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<TodoResponseDto> addTodo(@RequestBody TodoRequestDto requestDto) {
        Todo savedTodo = todoService.addTodo(requestDto.name(), requestDto.description());
        return ResponseEntity.ok(convertEntityToDto(savedTodo));
    }

    private static TodoResponseDto convertEntityToDto(Todo entity){
        return new TodoResponseDto(entity.getId(), entity.getName(), entity.getDescription());
    }

}
