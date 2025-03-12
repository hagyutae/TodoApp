package com.sb02.todoapp.service.impl;

import com.sb02.todoapp.entity.TodoEntity;
import com.sb02.todoapp.repository.TodoRepository;
import com.sb02.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public void save(String name, String context) {
        todoRepository.save(name, context);
    }

    @Override
    public Map<String, List<TodoEntity>> findAll() {
        Map<String, List<TodoEntity>> findAll = new HashMap<>();
        findAll.put("todos", todoRepository.findAll());
        System.out.println(findAll);
        return findAll;
        //return Map<String, List<TodoEntity>> GroupingByName = todoRepository.findAll().stream()
        //        .collect(Collectors.groupingBy(TodoEntity::getName));
    }
}
