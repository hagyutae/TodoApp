package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;

import java.util.List;

public interface TodoRepository {
    List<Todo> findAll(); //조회
    Todo save(Todo todo); //저장
}
