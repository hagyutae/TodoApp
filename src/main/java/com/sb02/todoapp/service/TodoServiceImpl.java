package com.sb02.todoapp.service;

import com.sb02.todoapp.dto.CreateTodoRequestDTO;
import com.sb02.todoapp.dto.CreateTodoResponseDTO;
import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    @Override
    public Todo createTodo(CreateTodoRequestDTO createTodoRequestDTO) {
        Todo todo = requestDtoToEntity(createTodoRequestDTO);
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> findAllTodos() {
        return todoRepository.findAll();
    }

    private Todo requestDtoToEntity(CreateTodoRequestDTO createTodoRequestDTO) {
        return new Todo(createTodoRequestDTO.name(), createTodoRequestDTO.description());
    }
}