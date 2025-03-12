package com.sb02.todoapp.controller;

public record CreateRequest(
        String name,
        String description
) {
}
