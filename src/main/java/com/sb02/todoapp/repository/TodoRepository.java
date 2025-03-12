package com.sb02.todoapp.repository;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class TodoRepository {
    private Map<String, String> todoList = new ConcurrentHashMap<>();

    public void save() {

    }

    public void get() {

    }

    public void delete() {

    }

    public void update() {

    }


}
