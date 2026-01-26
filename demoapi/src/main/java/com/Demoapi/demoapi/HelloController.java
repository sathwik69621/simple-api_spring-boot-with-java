package com.Demoapi.demoapi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

// this is the controllers handling get requests
// these are the get requests
    @GetMapping("/hello")
    public String helloApi() {
        return "Hello from Spring Boot REST API!";
    }


    @GetMapping("/info")
    public Map<String, String> info() {
    Map<String, String> data = new HashMap<>();
    data.put("name", "Sathwik");
    data.put("role", "Java Intern");
    data.put("status", "API Working");
    return data;
}

}
