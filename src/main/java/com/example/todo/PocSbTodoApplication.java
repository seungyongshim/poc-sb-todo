package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
public class PocSbTodoApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!!");
        SpringApplication.run(PocSbTodoApplication.class, args);
    }

}
