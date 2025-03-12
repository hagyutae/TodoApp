package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo addTodo(String name, String description) {
        Todo entity = new Todo(name, description);
        return todoRepository.save(entity);
    }

}
