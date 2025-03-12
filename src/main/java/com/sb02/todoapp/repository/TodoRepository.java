package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
    private final List<Todo> todos = new ArrayList<>();

    public List<Todo> findAll(){
        return new ArrayList<>(todos);
    }

    public Todo save(Todo todo){
         todos.add(todo);
         return todo;
    }
}
