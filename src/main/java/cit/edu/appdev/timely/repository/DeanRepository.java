package cit.edu.appdev.timely.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cit.edu.appdev.timely.entity.DeanEntity;

@Repository
public interface DeanRepository extends JpaRepository<DeanEntity, Integer>{

}
