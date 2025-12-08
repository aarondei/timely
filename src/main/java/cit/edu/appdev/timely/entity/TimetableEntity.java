package cit.edu.appdev.timely.entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_timetable")
public class TimetableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private ArrayList<CourseEntity> courselist;

    // constructor
    public TimetableEntity(ArrayList<CourseEntity> courselist) {
        this.courselist = courselist;
    }

    // getters
    public int getId() {
        return id;
    }

    public ArrayList<CourseEntity> getCourselist() {
        return courselist;
    }

    // setters
    public void setCourselist(ArrayList<CourseEntity> courselist) {
        this.courselist = courselist;
    }

}
