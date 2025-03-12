package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private final List<Todo> data;

    public TodoRepository() {
        this.data = new ArrayList<>();
    }

    public Todo save(Todo todo){
        data.add(todo);
        return todo;
    }

    public List<Todo> getTodos(){
        return this.data;
    }
}
