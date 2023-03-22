package com.devramonie.userspring.controllers;

import com.devramonie.userspring.entities.Users;
import com.devramonie.userspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<Users> findAll(){
       List<Users> result = repository.findAll();
       return result;
    }
}
