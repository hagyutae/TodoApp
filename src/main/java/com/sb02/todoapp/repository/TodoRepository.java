package com.sb02.todoapp.repository;

import com.sb02.todoapp.model.ToDo;
import com.sb02.todoapp.model.ToDos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {

    private final List<ToDo> toDos;

    public TodoRepository(){
        toDos = new ArrayList<>();
    }

    public ToDo save(ToDo toDo){
        toDos.add(toDo);
        return toDo;
    }

    public List<ToDo> findAll(){
        return toDos;
    }
}
