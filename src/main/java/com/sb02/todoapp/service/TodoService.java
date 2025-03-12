package com.sb02.todoapp.service;

import com.sb02.todoapp.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }
    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }
    public void addTodo(String name,String description){
        todoRepository.save(new Todo(name,description));
    }
}
