package com.sb02.todoapp.service;

import com.sb02.todoapp.application.TodoCreationDto;
import com.sb02.todoapp.application.TodoDto;
import com.sb02.todoapp.application.TodosDto;

public interface TodoService {
    TodoDto createTodo(TodoCreationDto todoCreationDto);

    TodosDto findAll();
}
