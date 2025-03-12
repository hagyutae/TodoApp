package com.sb02.todoapp.service;

import com.sb02.todoapp.Todo;
import com.sb02.todoapp.TodoDto;

import java.util.*;
import java.util.stream.Collectors;

public class Mapper {

    public static TodoDto DtoByTodo(Todo todo){
        return new TodoDto(todo.getName(), todo.getDescription());
    }
    public static Todo TodoByDto(TodoDto todoDto){
      Todo todo= new Todo();
      todo.setName(todoDto.getName());
      todo.setDescription(todo.getDescription());
      return todo;
    }
    public static List<TodoDto> toDTOList(List<Todo> todos) {
        return todos.stream()
                .map(todo -> Mapper.DtoByTodo(todo))
                .collect(Collectors.toList());
    }
}
