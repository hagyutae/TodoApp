package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepositoryImpl todoRepositoryImpl;

    public TodoServiceImpl(TodoRepositoryImpl todoRepositoryImpl) {
        this.todoRepositoryImpl = todoRepositoryImpl;
    }

    public void write(String name, String description) {
        Todo todo = new Todo(name, description);
        todoRepositoryImpl.save(todo);
    }

    public List<Todo> getTodo() {
        return todoRepositoryImpl.get();
    }
}
