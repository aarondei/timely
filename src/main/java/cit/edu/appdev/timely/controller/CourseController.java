package cit.edu.appdev.timely.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cit.edu.appdev.timely.entity.CourseEntity;
import cit.edu.appdev.timely.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService course_service;

    @PostMapping("/insertCourse")
    public CourseEntity insertCourse(@RequestBody CourseEntity course) {
        return course_service.insertCourse(course);
    }

    @GetMapping("/getAllCourse")
    public List<CourseEntity> getAllCourses() {
        return course_service.getAllCourses();
    }
}
