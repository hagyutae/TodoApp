package com.sb02.todoapp.repository.Impl;

import com.sb02.todoapp.entity.TodoEntity;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class ListTodoRepositoryImpl implements TodoRepository {

    private final List<TodoEntity> todoList = new ArrayList<>();

    @Override
    public void save(String name, String description) {
        TodoEntity todoEntity = new TodoEntity(name, description);
        todoList.add(todoEntity);
    }

    @Override
    public List<TodoEntity> findAll() {
        return todoList;
    }
}
