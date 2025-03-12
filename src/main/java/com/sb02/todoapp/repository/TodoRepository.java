package com.sb02.todoapp.repository;

import com.sb02.todoapp.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class TodoRepository {
    private final Map<UUID, Todo> todos = new HashMap<>();
    public ArrayList<Todo> findAll() {
        return new ArrayList<>(todos.values());
    }
    public Todo save(Todo todo) {
        if (todo.getId() == null) {
            UUID uuid=UUID.randomUUID();
            todos.put(uuid, todo);
        } else {
            todos.put(todo.getId(), todo);
        }
        return todo;
    }

}