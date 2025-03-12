package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@RequiredArgsConstructor
public class TodoRepositoryMpl implements TodoRepository {
    private final List<Todo> todos = new ArrayList<>();

    @Override
    public void save(Todo todo) {
        todos.add(todo);
    }

    @Override
    public List<Todo> findAll() {
        return todos;
    }
}
