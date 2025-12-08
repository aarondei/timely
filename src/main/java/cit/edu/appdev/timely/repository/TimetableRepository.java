package cit.edu.appdev.timely.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cit.edu.appdev.timely.entity.TimetableEntity;

@Repository
public interface TimetableRepository extends JpaRepository<TimetableEntity, Integer> {

}
