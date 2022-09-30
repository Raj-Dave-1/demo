// Dada Ki Jay Ho

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Models.*;
import com.example.demo.Repositories.consumerRepository;

@RestController
@CrossOrigin(origins = "*")
public class MyController {

    @Autowired
    consumerRepository repository;

    @GetMapping("/")
    public String initfun(){
        return "Dada Ki Jay Ho";
    }

    @PostMapping("/add")
    public String add(@RequestBody consumerModel data){
        repository.save(data);
        return "Data Stored";
    }
}
