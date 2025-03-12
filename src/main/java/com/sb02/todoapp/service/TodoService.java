package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    // TODO 목록 조회
    public List<Todo> getAllTodos(){
        return repository.findAll();
    }

    // TODO 등록
    public Todo createTodo(String name, String description){
        Todo todo = new Todo(name, description);
        return repository.save(todo);
    }

}
