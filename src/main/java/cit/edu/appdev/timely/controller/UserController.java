package cit.edu.appdev.timely.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import cit.edu.appdev.timely.entity.AuthRegisterRequest;
import cit.edu.appdev.timely.entity.AuthRequest;

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

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        UserEntity user = user_service.login(request.getEmail(), request.getPassword());

        if (user == null) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body("Invalid credentials");
        }

        return ResponseEntity.ok(user);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRegisterRequest req) {
        UserEntity created = user_service.register(req);

        if (created == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Email already exists");
        }

        return ResponseEntity.ok(created);
    }

}
