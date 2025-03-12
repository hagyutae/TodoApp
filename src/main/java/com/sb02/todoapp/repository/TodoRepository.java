package com.sb02.todoapp.repository;

import com.sb02.todoapp.Entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    public final List<Todo> todoList = new ArrayList<>();

    public List<Todo> findAll(){
        return todoList;
    }

    public void addTodo(Todo todo){
        todoList.add(todo);
    }

}
