package com.sb02.todoapp.service;

import com.sb02.todoapp.entities.Todo;

import java.util.List;
import java.util.UUID;

public interface TodoService {
    UUID createTodo(String name, String description);
    List<Todo> listAllTodos();
}
