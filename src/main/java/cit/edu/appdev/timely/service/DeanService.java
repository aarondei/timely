package cit.edu.appdev.timely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cit.edu.appdev.timely.entity.DeanEntity;
import cit.edu.appdev.timely.entity.UserEntity;
import cit.edu.appdev.timely.repository.DeanRepository;

@Service
public class DeanService {
    @Autowired
    DeanRepository dean_repository;

    public DeanEntity insertDean(DeanEntity dean) {
        return dean_repository.save(dean);
    }

    public List<DeanEntity> getAllDean() {
        return dean_repository.findAll();
    }

    public DeanEntity updateDean(int id, DeanEntity updatedDean) {
        DeanEntity existingDean = dean_repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dean not found with id: " + id));

        existingDean.setDepartment(updatedDean.getDepartment());
        dean_repository.save(existingDean);

        return dean_repository.save(existingDean);
    }

    public String deleteDean(int id) {
        if (!dean_repository.existsById(id)) {
            throw new RuntimeException("Dean not found with id: " + id);
        }

        dean_repository.deleteById(id);
        return "Dean with ID" + id + " has been deleted successfully";
    }
}