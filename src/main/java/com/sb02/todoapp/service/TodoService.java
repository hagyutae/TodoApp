package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.TodoEntity;

import java.util.List;
import java.util.Map;

public interface TodoService {
    void save(String title, String context);
    Map<String, List<TodoEntity>> findAll();
}
