package cit.edu.appdev.timely.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_program")
public class ProgramEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programId;

    private String programName;

    private String college;

    @ManyToMany
    @JoinTable(
        name = "tbl_program_course",
        joinColumns = @JoinColumn(name = "program_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<CourseEntity> coursesList;

    public ProgramEntity() {
        super();
    }

    public ProgramEntity(String programName, String college, List<CourseEntity> coursesList) {
        this.programName = programName;
        this.college = college;
        this.coursesList = coursesList;
    }

    // getters
    public int getProgramId() {
        return programId;
    }

    public String getProgramName() {
        return programName;
    }

    public String getCollege() {
        return college;
    }

    public List<CourseEntity> getCoursesList() {
        return coursesList;
    }

    // setters
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setCoursesList(List<CourseEntity> coursesList) {
        this.coursesList = coursesList;
    }
}