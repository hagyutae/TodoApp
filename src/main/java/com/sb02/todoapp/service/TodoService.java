package com.sb02.todoapp.service;

import com.sb02.todoapp.model.ToDo;
import com.sb02.todoapp.model.ToDos;
import com.sb02.todoapp.repository.TodoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public ToDos getAllTodos(){
        ToDos toDos = new ToDos(todoRepository.findAll());
        return toDos;
    }

    public ToDo registerTodo(ToDo todo){
        return todoRepository.save(todo);
    }


}
