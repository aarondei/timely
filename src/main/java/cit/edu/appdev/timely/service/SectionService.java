package cit.edu.appdev.timely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cit.edu.appdev.timely.entity.SectionEntity;
import cit.edu.appdev.timely.repository.SectionRepository;

@Service
public class SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    public SectionService() {
        super();
    }

    // CREATE - insert new section
    public SectionEntity insertSection(SectionEntity section) {
        return sectionRepository.save(section);
    }

    // READ - get all sections
    public List<SectionEntity> getAllSections() {
        return sectionRepository.findAll();
    }

    // UPDATE - update existing section
    public SectionEntity updateSection(int id, SectionEntity updatedSection) {
        SectionEntity existingSection = sectionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Section not found with id: " + id));

        existingSection.setCourseList(updatedSection.getCourseList());

        return sectionRepository.save(existingSection);
    }

    // DELETE - delete section
    public String deleteSection(int id) {
        if (!sectionRepository.existsById(id)) {
            throw new RuntimeException("Section not found with id: " + id);
        }

        sectionRepository.deleteById(id);
        return "Section with ID " + id + " has been deleted successfully";
    }
}