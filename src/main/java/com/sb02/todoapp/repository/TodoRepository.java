package com.sb02.todoapp.repository;

import com.sb02.todoapp.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TodoRepository {

    private static Map<Long, Todo> todos = new HashMap<>();
    private static Long idCounter = 0L;

    public List<Todo> findAll() {
        return new ArrayList<>(todos.values());
    }

    public Todo save(Todo todo) {
        todo.setId(idCounter);
        todos.put(idCounter++, todo);
        return todo;
    }

}
