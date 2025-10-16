package cit.edu.appdev.timely.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cit.edu.appdev.timely.entity.UserEntity;
import cit.edu.appdev.timely.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository user_repository;

    //C - create or insert user in tbluser
    public UserEntity insertStudent(UserEntity student){
        return user_repository.save(student);
    }

    //R - read all records in tbluser
    public List<UserEntity> getAllStudents(){
        return user_repository.findAll();
    }
}
