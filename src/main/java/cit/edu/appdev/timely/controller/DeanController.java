package cit.edu.appdev.timely.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cit.edu.appdev.timely.entity.DeanEntity;
import cit.edu.appdev.timely.service.DeanService;

@RestController
@RequestMapping("/dean")
public class DeanController {
    @Autowired
    DeanService dean_service;

    @PostMapping("/insertDean")
    public DeanEntity insertDean(@RequestBody DeanEntity dean){
        return dean_service.insertDean(dean);
    }

    @GetMapping("/getAllDean")
    public List<DeanEntity> getAllDean(){
        return dean_service.getAllDean();
    }

    @PutMapping("/updateDean/{id}")
    public DeanEntity updateDean(@PathVariable int id, @RequestBody DeanEntity updatedDean){
        return dean_service.updateDean(id, updatedDean);
    }

    @DeleteMapping("/deleteDean/{id}")
    public String deleteDean(@PathVariable int id){
        return dean_service.deleteDean(id);
    }
}
