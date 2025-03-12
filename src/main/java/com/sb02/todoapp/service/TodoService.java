package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TodoService {
    private final List<Todo> todos = new ArrayList<>();
    private long id_count = 1;

    public List<Todo> getAllTodos() {
        return todos;
    }

    public void addTodo(String name, String description) {
        todos.add(new Todo(id_count++, name, description));
    }
}
