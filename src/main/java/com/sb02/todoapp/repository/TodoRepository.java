package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;

import java.util.List;

public interface TodoRepository {
    List<Todo> findAll();
    Todo save(Todo todo);
}
