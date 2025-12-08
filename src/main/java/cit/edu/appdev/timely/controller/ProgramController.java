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

import cit.edu.appdev.timely.entity.ProgramEntity;
import cit.edu.appdev.timely.service.ProgramService;

@RestController
@RequestMapping("/program")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @PostMapping("/insertProgram")
    public ProgramEntity insertProgram(@RequestBody ProgramEntity program) {
        return programService.insertProgram(program);
    }

    @GetMapping("/getAllPrograms")
    public List<ProgramEntity> getAllPrograms() {
        return programService.getAllPrograms();
    }

    @PutMapping("/updateProgram/{id}")
    public ProgramEntity updateProgram(@PathVariable int id, @RequestBody ProgramEntity updatedProgram) {
        return programService.updateProgram(id, updatedProgram);
    }

    @DeleteMapping("/deleteProgram/{id}")
    public String deleteProgram(@PathVariable int id) {
        return programService.deleteProgram(id);
    }
}

