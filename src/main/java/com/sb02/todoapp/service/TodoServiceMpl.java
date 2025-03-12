package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TodoServiceMpl implements TodoService{
    private final TodoRepository todoRepository;


    @Override
    public void createTodo(Todo newTodo) {
        todoRepository.save(newTodo);
    }

    @Override
    public List<Todo> listAllTodo() {
        return todoRepository.findAll();
    }
}
