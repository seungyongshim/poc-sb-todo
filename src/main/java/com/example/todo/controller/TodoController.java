package com.example.todo.controller;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TodoController {

    public TodoController()
    {
        todos.put(1, "1");
        todos.put(2, "2");
        todos.put(3, "3");
    }

    @Getter
    @Setter(AccessLevel.PRIVATE)
    Map<Integer, String> todos = new HashMap<>();

    @GetMapping(value = "/todo")
    public Object AllTodos()
    {
        return todos;
    }
}
