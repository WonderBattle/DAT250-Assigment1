package com.DAT250Assigment1.DAT250;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dat250Assigment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dat250Assigment1Application.class, args);
	}

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

}
