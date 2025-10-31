package cit.edu.appdev.timely.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cit.edu.appdev.timely.entity.TeacherEntity;
import cit.edu.appdev.timely.repository.TeacherRepository;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacher_repository;

    public TeacherEntity insertTeacher(TeacherEntity teacher){
        return teacher_repository.save(teacher);
    }

    public List<TeacherEntity> getAllTeacher(){
        return teacher_repository.findAll();
    }

    public TeacherEntity updateTeacher(int id, TeacherEntity updatedTeacher){
        TeacherEntity existingTeacher = teacher_repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Teacher not found with id: " + id));

        existingTeacher.setFirstname(updatedTeacher.getFirstname());
        existingTeacher.setLastname(updatedTeacher.getLastname());
        existingTeacher.setEmail(updatedTeacher.getEmail());

        return teacher_repository.save(existingTeacher);
    }

    public String deleteTeacher(int id){
        if(!teacher_repository.existsById(id)){
            throw new RuntimeException("Teacher not found with id: " + id);
        }

        teacher_repository.deleteById(id);
        return "Teacher with ID" + id + "has been deleted successfully";
    }
}
