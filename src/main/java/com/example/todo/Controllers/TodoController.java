package com.example.todo.Controllers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    TodoController()
    {
    }

    @Getter
    @Setter(AccessLevel.PRIVATE)
    List<String> todos = List.of(new String[]{
            "1", "2", "3"
    });

    @GetMapping(value = "/todo")
    public Object AllTodos()
    {
        return todos;
    }
}
