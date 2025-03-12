package com.sb02.todoapp.repository;

import com.sb02.todoapp.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private final List<Todo> todos = new ArrayList<>();

    public List<Todo> findAll() {
        return todos;
    }

    public void save(Todo todo) {
        todos.add(todo);
    }
}