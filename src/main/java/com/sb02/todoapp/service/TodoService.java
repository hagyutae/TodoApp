package com.sb02.todoapp.service;

import com.sb02.todoapp.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {

    private final TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository) {

        this.todoRepository = todoRepository;
    }
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
    public Todo saveTodo(Todo todo) {

        return todoRepository.save(todo);
    }
}
