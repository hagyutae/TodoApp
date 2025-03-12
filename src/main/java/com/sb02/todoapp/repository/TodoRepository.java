package com.sb02.todoapp.repository;


import com.sb02.todoapp.entity.Todo;

import java.util.List;

public interface TodoRepository {
    void save(Todo todo);
    List<Todo> findAll();
}
