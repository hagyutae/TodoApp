package com.sb02.todoapp.repository;

import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@Repository
public class TodoRepository {
    private final List<Map<String, String>> todos = new ArrayList<>();

    public List<Map<String, String>> getAllTodos(){
        return todos;
    }

    public void addTodo(Map<String, String>todo) {
        todos.add(todo);
    }
}
