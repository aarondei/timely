package cit.edu.appdev.timely.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cit.edu.appdev.timely.entity.CourseEntity;
import cit.edu.appdev.timely.repository.CourseRepository;

@Service
public class CourseService {
    @Autowired
    CourseRepository course_repository;

    // C - Create or insert course in tbl_course
    public CourseEntity insertCourse(CourseEntity course) {
        return course_repository.save(course);
    }

    // R - Read all records in tbl_course
    public List<CourseEntity> getAllCourses() {
        return course_repository.findAll();
    }
}