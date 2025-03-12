package com.sb02.todoapp.repository.Impl;

import com.sb02.todoapp.entity.TodoEntity;
import com.sb02.todoapp.repository.TodoRepository;
import com.sb02.todoapp.utils.FileManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FileTodoRepositoryImpl implements TodoRepository {

    private final FileManager fileManager;

    @Override
    public void save(String title, String content) {
        TodoEntity todoEntity = new TodoEntity(title, content);
        fileManager.todoListFileWriter(todoEntity);
    }

    @Override
    public List<TodoEntity> findAll() {
        return fileManager.todoListFileReader();
    }
}
