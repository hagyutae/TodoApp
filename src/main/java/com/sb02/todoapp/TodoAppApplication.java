package com.sb02.todoapp;

import com.sb02.todoapp.controller.TodoPageController;
import com.sb02.todoapp.controller.TodoRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppApplication.class, args);
    }
}
