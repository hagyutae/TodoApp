package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepository {
    private final Map<UUID, Todo> data = new HashMap<>();

    public void save(Todo todo) {
        data.put(todo.getId(), todo);
    }

    public List<Todo> findAll() {
        return new ArrayList<>(data.values());
    }
}
