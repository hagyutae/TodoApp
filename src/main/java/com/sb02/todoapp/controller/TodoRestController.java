package com.sb02.todoapp.controller;

import com.sb02.todoapp.dto.CreateTodoRequestDTO;
import com.sb02.todoapp.dto.CreateTodoResponseDTO;
import com.sb02.todoapp.dto.TodoListDTO;
import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todos")
public class TodoRestController {
    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<CreateTodoResponseDTO> createTodo(@RequestBody CreateTodoRequestDTO createTodoRequestDTO) {
        Todo createdTodo = todoService.createTodo(createTodoRequestDTO);
        CreateTodoResponseDTO createTodoResponseDTO = entityToResponseDto(createdTodo);
        return ResponseEntity.ok(createTodoResponseDTO);
    }


    @GetMapping
    public ResponseEntity<TodoListDTO> getAllTodos() {
        List<Todo> todos = todoService.findAllTodos();
        List<CreateTodoResponseDTO> todoList =
                todos.stream()
                        .map(todo -> entityToResponseDto(todo))
                        .toList();
        return ResponseEntity.ok(new TodoListDTO(todoList));
        // DTO로 한번 더 감싸서 프론트단에서 todos 필드에서 forEach를 돌릴 수 있게끔 형태 맞춰줌
    }


    private CreateTodoResponseDTO entityToResponseDto(Todo todo) {
        return new CreateTodoResponseDTO(todo.getId(), todo.getName(), todo.getDescription());
    }


}





