package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private final List<Todo> todoList = new ArrayList<>();

    public List<Todo> findAll() {
        return todoList; // 메모리에 저장된 리스트 반환
    }

    public List<Todo> save(Todo todo) {
        todoList.add(todo);
        return todoList;
    }
}
