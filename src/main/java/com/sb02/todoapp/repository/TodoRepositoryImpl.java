package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepositoryImpl implements TodoRepository {

    private final Map<UUID, Todo> todoMap = new HashMap<>();

    @Override
    public List<Todo> findAll() {
        return todoMap.values().stream()
                .sorted(Comparator.comparing(Todo::getCreatedAt).reversed())
                .toList();
    }

    @Override
    public Todo save(Todo todo) {
        todoMap.put(todo.getId(), todo);
        return todo;
    }
}
