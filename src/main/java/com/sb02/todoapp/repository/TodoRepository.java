package com.sb02.todoapp.repository;

import com.sb02.todoapp.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private final List<Todo> todos = new ArrayList<>();

    public void save(Todo todo) {
        todos.add(todo);
    }

    public List<Todo> findAll() {
        return todos;
    }
}
