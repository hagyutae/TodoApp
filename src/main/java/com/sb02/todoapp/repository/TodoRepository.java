package com.sb02.todoapp.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private List<Todo> todos = new ArrayList<>();

    public List<Todo> findAll(){
        return new ArrayList<>(todos);
    }

    public Todo save(Todo todo){
        todos.add(todo);
        return todo;
    }
}
