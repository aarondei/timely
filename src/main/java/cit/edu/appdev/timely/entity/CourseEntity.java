package cit.edu.appdev.timely.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tbl_course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(name = "course_code", nullable = false, unique = true)
    private String courseCode;
    @Column(name = "course_description", nullable = false)
    private String courseDescription;
    @Column(name = "units")
    private int units;

    @Column(name = "yearOffered")
    private int yearOffered;
    @Column(name = "semester")
    private int semester;
    @Column(name = "program")
    private String program;

    public int getYearOffered() {
        return yearOffered;
    }

    public void setYearOffered(int yearOffered) {
        this.yearOffered = yearOffered;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public CourseEntity() {}

    public CourseEntity(String courseCode, String courseDescription, int units){
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.units = units;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

}
