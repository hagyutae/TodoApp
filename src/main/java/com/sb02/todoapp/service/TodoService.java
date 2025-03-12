package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;

import java.util.List;

public interface TodoService {
    void write(String name, String description);
    List<Todo> getTodo();
}
