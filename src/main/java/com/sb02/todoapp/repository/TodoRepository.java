package com.sb02.todoapp.repository;

import com.sb02.todoapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
