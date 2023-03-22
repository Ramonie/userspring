package com.devramonie.userspring.controllers;

import com.devramonie.userspring.entities.Users;
import com.devramonie.userspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/{id}")
    public Users findById(@PathVariable Long id){
        Users result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public Users insert(@RequestBody Users users){
        Users result = repository.save(users);
        return result;
    }
}
