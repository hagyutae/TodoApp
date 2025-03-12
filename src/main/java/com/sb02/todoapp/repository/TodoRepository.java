package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepository {
    private final List<Todo> todos = new ArrayList<>();

    public List<Todo> findAll() {
        return new ArrayList<>(todos);
    }

    public void save(Todo todo) {
        todos.add(todo);
    }
}
