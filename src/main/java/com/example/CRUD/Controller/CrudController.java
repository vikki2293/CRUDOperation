package com.example.CRUD.Controller;

import com.example.CRUD.Model.User;
import com.example.CRUD.Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class CrudController {

@Autowired
private CrudService service;

@PostMapping
public User createUser(@RequestBody User user){
    return service.saveUser(user);
}

@DeleteMapping("/{id}")
public String deleteuser(@PathVariable Long id)
{
service.deleteUserbyId(id);
    return "User deleted";
}

@GetMapping("/{id}")
public User getUerbyid(@PathVariable Long id)
{
    return service.getUserbyId(id).orElseThrow(() -> new RuntimeException("User not found"));
}
}
