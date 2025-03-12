package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepository {
    private final Map<UUID, Todo> todos = new HashMap<>();

    public Optional<List<Todo>> findAllTodo(){
        return Optional.of(new ArrayList<>(todos.values()));
    }

    public void save(Todo todo){
        todos.put(todo.getId(), todo);
    }
}
