package com.sb02.todoapp.service;

import com.sb02.todoapp.dto.TodoAddRequestDto;
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

    public TodoResponseDto addTodo(TodoAddRequestDto todoAddRequestDto) {
        Todo todo = todoAddRequestDto.toEntity();
        todoRepository.save(todo);
        return TodoResponseDto.fromEntity(todo);
    }

    public void deleteTodo(String id) {
        todoRepository.deleteById(id);
    }
}
