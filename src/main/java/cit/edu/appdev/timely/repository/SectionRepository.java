package cit.edu.appdev.timely.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cit.edu.appdev.timely.entity.SectionEntity;

@Repository
public interface SectionRepository extends JpaRepository<SectionEntity, Integer> {

}