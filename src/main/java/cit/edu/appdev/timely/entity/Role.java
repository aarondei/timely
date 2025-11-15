package cit.edu.appdev.timely.entity;

import jakarta.persistence.Id;

public abstract class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;
}
