package com.sb02.todoapp.repository;

import com.sb02.todoapp.entities.Todo;

import java.util.List;

public interface TodoRepository {
    Todo save(Todo todo);
    List<Todo> findAll();
}
