package com.sb02.todoapp.utils;

import com.sb02.todoapp.entity.TodoEntity;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileManager {
    //private Resource resource = new ClassPathResource("todoList/");
    private final String FILEDIR = System.getProperty("user.dir") + "\\src\\main\\resources\\todoList\\";

    public void todoListFileWriter(TodoEntity todoEntity) {
        String todoName = todoEntity.getId().toString();
        String filepath = String.format("%s%s.ser",FILEDIR, todoName);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath)))
        {
            oos.writeObject(todoEntity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<TodoEntity> todoListFileReader() {
        List<TodoEntity> todoList = new ArrayList<>();
        System.out.println(FILEDIR);
        File directory = new File(FILEDIR);

        File[] files = directory.listFiles();
        for (File file : files) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                TodoEntity todoEntity = (TodoEntity) ois.readObject();
                todoList.add(todoEntity);
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return todoList;
    }
}
