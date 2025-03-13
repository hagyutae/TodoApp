package com.sb02.todoapp.controller;

import com.sb02.todoapp.entities.Todo;
import com.sb02.todoapp.service.TodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoRestController {

    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<TodoDisplayList> getTodos() {
        TodoDisplayList displayList = new TodoDisplayList(
                todoService.listAllTodos().stream()
                        .map(TodoRestController::convertTodoToItemDto)
                        .toList()
        );
        return ResponseEntity.ok(displayList);
    }

    private static TodoDisplayItem convertTodoToItemDto(Todo todo) {
        return new TodoDisplayItem(todo.getName(), todo.getDescription());
    }

    @PostMapping
    public ResponseEntity<CreateResult> createTodo(@RequestBody @Valid CreateRequest createRequest) {
        UUID createdId = todoService.createTodo(createRequest.name(), createRequest.description());
        return ResponseEntity.ok(new CreateResult(createdId));
    }
}
