package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void write(String name, String description) {
        Todo todo = new Todo(name, description);
        todoRepository.save(todo);
    }

    public List<Todo> getTodo() {
        return todoRepository.get();
    }
}
