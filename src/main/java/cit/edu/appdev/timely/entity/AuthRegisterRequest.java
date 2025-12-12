package cit.edu.appdev.timely.entity;

public class AuthRegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private String role;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }
}
