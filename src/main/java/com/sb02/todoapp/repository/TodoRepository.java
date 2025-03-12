package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.TodoEntity;

import java.util.List;
import java.util.Map;

public interface TodoRepository {
    void save(String title, String content);
    List<TodoEntity> findAll();
}
