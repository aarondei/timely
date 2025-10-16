package cit.edu.appdev.timely.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public UserEntity insertStudent(@RequestBody UserEntity student){
        return user_service.insertStudent(student);
    }

    @GetMapping("/getAllUser")
    public List<UserEntity> getAllStudents(){
        return user_service.getAllStudents();
    }
}
