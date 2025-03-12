package com.sb02.todoapp.service;

import com.sb02.todoapp.application.TodoCreationDto;
import com.sb02.todoapp.application.TodoDto;
import com.sb02.todoapp.application.TodosDto;
import com.sb02.todoapp.domain.Todo;
import com.sb02.todoapp.repository.TodoRepositoryImpl;
import java.util.Comparator;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepositoryImpl todoRepositoryImpl;

    public TodoDto createTodo(TodoCreationDto todoCreationDto) {
        Todo todo = new Todo(todoCreationDto.name(), todoCreationDto.description());
        return TodoDto.fromEntity(todoRepositoryImpl.save(todo));
    }

    public TodosDto findAll() {
        List<TodoDto> todos = todoRepositoryImpl.findAll()
                .stream()
                .sorted(Comparator.comparing(Todo::getCreatedAt))
                .map(TodoDto::fromEntity)
                .toList();

        return TodosDto.fromEntity(todos);
    }
}
