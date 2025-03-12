package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepository {
    private final Map<String, Todo> todos = new HashMap<>();

    public List<Todo> findAll() {
        return new ArrayList<>(todos.values());
    }

    public void save(Todo todo) {
        todos.put(todo.getId(), todo);
    }

    public void deleteById(String id) {
        todos.remove(id);
    }
}
