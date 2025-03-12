package com.sb02.todoapp.service;

import com.sb02.todoapp.dto.TodoCreateRequestDto;
import com.sb02.todoapp.dto.TodoCreateResponseDto;
import com.sb02.todoapp.dto.TodoListResponseDto;
import com.sb02.todoapp.dto.TodoResponseDto;
import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoCreateResponseDto create(TodoCreateRequestDto todoCreateRequestDto) {
        Todo todo = Todo.builder()
                .id(UUID.randomUUID())
                .name(todoCreateRequestDto.getName())
                .description(todoCreateRequestDto.getDescription())
                .build();

        todoRepository.save(todo);

        return TodoCreateResponseDto.builder()
                .id(todo.getId())
                .name(todo.getName())
                .description(todo.getDescription())
                .build();
    }

    public TodoListResponseDto getAllTodos() {
        List<TodoResponseDto> todos = todoRepository.findAll().stream().map(todo -> TodoResponseDto.builder()
                .id(todo.getId())
                .name(todo.getName())
                .description(todo.getDescription())
                .build()).toList();

        return TodoListResponseDto.builder()
                .todos(todos)
                .build();
    }
}
