package cit.edu.appdev.timely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cit.edu.appdev.timely.entity.StudentEntity;
import cit.edu.appdev.timely.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository student_repository;

    // C - create or insert user in tbluser
    public StudentEntity insertStudent(StudentEntity student) {
        return student_repository.save(student);
    }

    // R - read all records in tbluser
    public List<StudentEntity> getAllStudents() {
        return student_repository.findAll();
    }

    // U - update existing user details
    public StudentEntity updateStudent(int id, StudentEntity updatedStudent) {
        StudentEntity existingStudent = student_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        existingStudent.setProgram(updatedStudent.getProgram());

        return student_repository.save(existingStudent);
    }

    // D - delete user
    public String deleteStudent(int id) {
        if (!student_repository.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        student_repository.deleteById(id);
        return "Student with ID" + id + "has been deleted successfully";
    }
}
