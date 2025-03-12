package com.sb02.todoapp.service;

import com.sb02.todoapp.application.TodoCreationDto;
import com.sb02.todoapp.application.TodoDto;
import com.sb02.todoapp.application.TodosDto;
import com.sb02.todoapp.domain.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoDto createTodo(TodoCreationDto todoCreationDto) {
        Todo todo = new Todo(todoCreationDto.name(), todoCreationDto.description());
        return TodoDto.fromEntity(todoRepository.save(todo));
    }

    public TodosDto findAll() {
        List<TodoDto> todos = todoRepository.findAll()
                .stream()
                .map(TodoDto::fromEntity)
                .toList();

        return TodosDto.fromEntity(todos);
    }
}
