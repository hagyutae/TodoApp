package com.sb02.todoapp.service;

import com.sb02.todoapp.dto.CreateTodoRequestDTO;
import com.sb02.todoapp.dto.CreateTodoResponseDTO;
import com.sb02.todoapp.entity.Todo;

import java.util.List;

public interface TodoService {
    Todo createTodo(CreateTodoRequestDTO createTodoRequestDTO);
    List<Todo> findAllTodos();
}