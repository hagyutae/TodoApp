package com.sb02.todoapp.service;


import com.sb02.todoapp.repository.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo){
        return todoRepository.save(todo);
    }

}
