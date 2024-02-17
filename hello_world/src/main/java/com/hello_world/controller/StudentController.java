package com.hello_world.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student/")
public class StudentController {
    @Value("${app.name: Default Hello World}")
    private String appName;
    @GetMapping("/get")
    // @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getStudent() {
        // return "Hello Student";
        return appName;
    }
}