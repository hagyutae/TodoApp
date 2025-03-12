package com.sb02.todoapp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TodoService {
    private final List<Map<String, String>> todos = new ArrayList<>();

    public List<Map<String, String>> getTodos() {
        return todos;
    }

    public Map<String, String> creatTodo(Map<String, String> todoData) {
        todos.add(todoData);
        return todoData;
    }
}
