package cit.edu.appdev.timely.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cit.edu.appdev.timely.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}