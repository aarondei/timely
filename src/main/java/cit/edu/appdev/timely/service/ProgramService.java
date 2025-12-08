package cit.edu.appdev.timely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cit.edu.appdev.timely.entity.ProgramEntity;
import cit.edu.appdev.timely.repository.ProgramRepository;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    public ProgramService() {
        super();
    }

    // CREATE - insert new program
    public ProgramEntity insertProgram(ProgramEntity program) {
        return programRepository.save(program);
    }

    // READ - get all program
    public List<ProgramEntity> getAllPrograms() {
        return programRepository.findAll();
    }

    // UPDATE - update existing program
    public ProgramEntity updateProgram(int id, ProgramEntity updatedProgram) {
        ProgramEntity existingProgram = programRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Program not found with id: " + id));

        existingProgram.setCoursesList(updatedProgram.getCoursesList());

        return programRepository.save(existingProgram);
    }

    // DELETE - delete program
    public String deleteProgram(int id) {
        if (!programRepository.existsById(id)) {
            throw new RuntimeException("Program not found with id: " + id);
        }

        programRepository.deleteById(id);
        return "Program with ID " + id + " has been deleted successfully";
    }
}
