package cit.edu.appdev.timely.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cit.edu.appdev.timely.entity.UserEntity;
import cit.edu.appdev.timely.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService user_service;

    @PostMapping("/insertUser")
    public UserEntity insertStudent(@RequestBody UserEntity student) {
        return user_service.insertUser(student);
    }

    @GetMapping("/getAllUser")
    public List<UserEntity> getAllUser() {
        return user_service.getAllUser();
    }

    @PutMapping("/updateUser/{id}")
    public UserEntity updateUser(@PathVariable int id, @RequestBody UserEntity updatedUser) {
        return user_service.updateUser(id, updatedUser);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        return user_service.deleteUser(id);
    }
}
