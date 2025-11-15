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

    // U - Update existing course
    public CourseEntity updateCourse(int id, CourseEntity updatedCourse) {

        CourseEntity existingCourse = course_repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));

        existingCourse.setCourseCode(updatedCourse.getCourseCode());
        existingCourse.setCourseDescription(updatedCourse.getCourseDescription());
        existingCourse.setUnits(updatedCourse.getUnits());

        return course_repository.save(existingCourse);
    }

    // D - remove course
    public String deleteCourse(int id) {
        if (!course_repository.existsById(id)) {
            throw new RuntimeException("Course not found with id: " + id);
        }

        course_repository.deleteById(id);
        return "Course with ID " + id + " has been deleted successfully.";
    }
}