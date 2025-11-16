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

import cit.edu.appdev.timely.entity.TeacherEntity;
import cit.edu.appdev.timely.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacher_service;

    @PostMapping("/insertTeacher")
    public TeacherEntity insertTeacher(@RequestBody TeacherEntity teacher){
        return teacher_service.insertTeacher(teacher);
    }

    @GetMapping("/getAllTeacher")
    public List<TeacherEntity> getAllTeacher(){
        return teacher_service.getAllTeacher();
    }

    @PutMapping("/updateTeacher/{id}")
    public TeacherEntity updateTeacher(@PathVariable int id, @RequestBody TeacherEntity updatedTeacher){
        return teacher_service.updateTeacher(id, updatedTeacher);
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public String deleteTeacher(@PathVariable int id){
        return teacher_service.deleteTeacher(id);
    }
}