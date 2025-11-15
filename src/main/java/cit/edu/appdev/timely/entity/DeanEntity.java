package cit.edu.appdev.timely.entity;

import jakarta.persistence.Entity;

@Entity
public class DeanEntity extends Role {

    private String department;

    public DeanEntity(String firstname, String lastname, String username, String password, String email,
            String department) {
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
