package com.sb02.todoapp.service;

import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Map<String, String>> getAllTodos() {
        return todoRepository.getAllTodos();
    }

    public void createTodo(Map<String, String> todo){
        todoRepository.addTodo(todo);
    }
}
