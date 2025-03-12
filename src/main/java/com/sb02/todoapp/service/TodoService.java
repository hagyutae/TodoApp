package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<Todo> getTodoList(){
        return todoRepository.findAll();
    }

    public void createTodo(Todo todo){
        todoRepository.addTodo(todo);
    }
}
