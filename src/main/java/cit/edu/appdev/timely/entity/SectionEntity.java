package cit.edu.appdev.timely.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_section")
public class SectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sectionId;

    @ManyToMany
    @JoinTable(
        name = "tbl_section_course",
        joinColumns = @JoinColumn(name = "section_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<CourseEntity> courseList;

    public SectionEntity() {
        super();
    }

    public SectionEntity(List<CourseEntity> courseList) {
        this.courseList = courseList;
    }

    // getters
    public int getSectionId() {
        return sectionId;
    }

    public List<CourseEntity> getCourseList() {
        return courseList;
    }

    // setters
    public void setCourseList(List<CourseEntity> courseList) {
        this.courseList = courseList;
    }
}