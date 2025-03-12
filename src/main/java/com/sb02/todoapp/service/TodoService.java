package com.sb02.todoapp.service;

import com.sb02.todoapp.application.TodoCreationDto;
import com.sb02.todoapp.application.TodoDto;
import com.sb02.todoapp.domain.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoDto createTodo(TodoCreationDto todoCreationDto) {
        Todo todo = new Todo(todoCreationDto.name(), todoCreationDto.content());
        return TodoDto.fromEntity(todoRepository.save(todo));
    }
}
