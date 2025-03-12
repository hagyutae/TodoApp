package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepositoryImpl implements TodoRepository {
    private List<Todo> todoList = new ArrayList<>();

    public void save(Todo todo) {
        todoList.add(todo);
    }

    public List<Todo> get() {
        return todoList;
    }
}
