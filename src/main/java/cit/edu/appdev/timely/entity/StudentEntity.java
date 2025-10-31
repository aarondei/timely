package cit.edu.appdev.timely.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity extends UserEntity{

    private String program;

    public StudentEntity(String firstname, String lastname, String username, String password, String email, String program) {
        super(firstname, lastname, username, password, email);
        this.program = program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public String getProgram(){
        return program;
    }
}
