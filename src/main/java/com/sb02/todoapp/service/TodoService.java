package com.sb02.todoapp.service;

import com.sb02.todoapp.dto.TodoRequestDto;
import com.sb02.todoapp.dto.TodoResponseDto;
import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<TodoResponseDto> getAllTodos() {
        return todoRepository.findAll().stream()
                .map(TodoResponseDto::fromEntity)
                .toList();
    }

    public TodoResponseDto addTodo(TodoRequestDto todoRequestDto) {
        Todo todo = todoRequestDto.toEntity();
        todoRepository.save(todo);
        return TodoResponseDto.fromEntity(todo);
    }
}
