package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class TodoRepositoryImpl implements TodoRepository{
    private final Map<UUID, Todo> todos;

    public TodoRepositoryImpl() {
        todos = new ConcurrentHashMap<>();
    }

    @Override
    public Todo save(Todo todo) {
        todos.put(todo.getId(), todo);
        return todos.get(todo.getId());
    }

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(todos.values());
    }
}
