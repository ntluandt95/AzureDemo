package com.example.AzureDemo.controllers;

import com.example.AzureDemo.Student;
import com.example.AzureDemo.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloController {

    @Autowired
    studentRepo repo;

    @GetMapping("/{id}")
    public Student hello(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Student fruit(@RequestBody Student student) {
        return repo.save(student);
    }
}

