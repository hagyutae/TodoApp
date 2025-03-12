package com.sb02.todoapp.service;


import com.sb02.todoapp.entity.Todo;

import java.util.List;
import java.util.UUID;

public interface TodoService {
    void createTodo(Todo newTodo);
    List<Todo> listAllTodo();
}
