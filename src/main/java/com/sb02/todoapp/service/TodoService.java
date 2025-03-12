package com.sb02.todoapp.service;

import com.sb02.todoapp.model.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {
        Todo todo1 = todoRepository.findById(id).orElseThrow();
        todo1.setTitle(updatedTodo.getTitle());
        todo1.setCompleted(updatedTodo.isCompleted());
        todoRepository.save(todo1);
        return todo1;
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
