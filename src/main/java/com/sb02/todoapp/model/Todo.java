package com.sb02.todoapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    private boolean completed;
}
