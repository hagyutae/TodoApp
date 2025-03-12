package com.sb02.todoapp.model;

import java.util.List;

public class ToDos {
    private List<ToDo> todos;

    public ToDos(List<ToDo> todos) {
        this.todos = todos;
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }
}
