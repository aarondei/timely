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

import cit.edu.appdev.timely.entity.StudentEntity;
import cit.edu.appdev.timely.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService student_service;

    @PostMapping("/insertStudent")
    public StudentEntity insertStudent(@RequestBody StudentEntity student){
        return student_service.insertStudent(student);
    }

    @GetMapping("/getAllStudent")
    public List<StudentEntity> getAllStudents(){
        return student_service.getAllStudents();
    }

    @PutMapping("/updateStudent/{id}")
    public StudentEntity updateStudent(@PathVariable int id, @RequestBody StudentEntity updatedStudent){
        return student_service.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
        return student_service.deleteStudent(id);
    }
}
