package com.sb02.todoapp.controller;

import java.util.List;

public record TodoDisplayList(
        List<TodoDisplayItem> todos
) {
}
