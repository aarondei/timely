package cit.edu.appdev.timely.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity extends Role {

    private String program;

    public StudentEntity() {
        super("student");
    }

    public StudentEntity(String firstname, String lastname, String username, String password, String email,
            String program) {
        this.program = program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }
}
