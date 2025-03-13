package com.sb02.todoapp.service;

import com.sb02.todoapp.entities.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public UUID createTodo(String name, String description) {
        Todo entity = new Todo(name, description);
        todoRepository.save(entity);
        return entity.getId();
    }

    @Override
    public List<Todo> listAllTodos() {
        return todoRepository.findAll();
    }
}
