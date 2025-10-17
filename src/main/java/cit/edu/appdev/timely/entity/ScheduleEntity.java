package cit.edu.appdev.timely.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_schedule")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String section; // FK
    private String room;
    private String teacher; // USER FK
    private String day;
    // private String timeslots; //startTime - endTime
    private int studentNumber;

    public ScheduleEntity() {
        super();
    }

    public ScheduleEntity(String section, String room, String teacher, String day, int studentNumber) {
        super();
        this.section = section;
        this.room = room;
        this.teacher = teacher;
        this.day = day;
        this.studentNumber = studentNumber;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getSection() {
        return section;
    }

    public String getRoom() {
        return room;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDay() {
        return day;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    // setters
    public void setSection(String section) {
        this.section = section;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
