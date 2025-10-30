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

    //U - update existing user details
    public UserEntity updateUser(int id, UserEntity updatedUser){
        UserEntity existingUser = user_repository.findById(id)
        .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        existingUser.setFirstname(updatedUser.getFirstname());
        existingUser.setLastname(updatedUser.getLastname());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setPassword(updatedUser.getPassword());

        return user_repository.save(existingUser);
    }

    //D - delete user
    public String deleteUser(int id){
        if(!user_repository.existsById(id)){
            throw new RuntimeException("User not found with id: " + id);
        }

        user_repository.deleteById(id);
        return "User with ID" + id + "has been deleted successfully";
    }
}


