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

import cit.edu.appdev.timely.entity.SectionEntity;
import cit.edu.appdev.timely.service.SectionService;

@RestController
@RequestMapping("/section")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @PostMapping("/insertSection")
    public SectionEntity insertSection(@RequestBody SectionEntity section) {
        return sectionService.insertSection(section);
    }

    @GetMapping("/getAllSections")
    public List<SectionEntity> getAllSections() {
        return sectionService.getAllSections();
    }

    @PutMapping("/updateSection/{id}")
    public SectionEntity updateSection(@PathVariable int id, @RequestBody SectionEntity updatedSection) {
        return sectionService.updateSection(id, updatedSection);
    }

    @DeleteMapping("/deleteSection/{id}")
    public String deleteSection(@PathVariable int id) {
        return sectionService.deleteSection(id);
    }
}