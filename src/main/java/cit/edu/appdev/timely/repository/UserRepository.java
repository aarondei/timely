package cit.edu.appdev.timely.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cit.edu.appdev.timely.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
