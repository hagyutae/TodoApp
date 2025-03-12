package com.sb02.todoapp.repository;

import com.sb02.todoapp.entities.Todo;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@NoArgsConstructor
public class TodoRepositoryImpl implements TodoRepository {
    private final Map<UUID, Todo> todos = new ConcurrentHashMap<>();

    public Todo save(Todo todo) {
        todos.put(todo.getId(), todo);
        return todo;
    }

    public List<Todo> findAll() {
        return todos.values().stream()
                .sorted(Comparator.comparing(Todo::getCreatedAt).reversed())
                .toList();
    }
}
