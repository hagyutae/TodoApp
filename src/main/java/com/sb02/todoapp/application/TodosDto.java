package com.sb02.todoapp.application;

import java.util.List;

public record TodosDto(List<TodoDto> todos) {
    public static TodosDto fromEntity(List<TodoDto> todos){
        return new TodosDto(todos);
    }
}
