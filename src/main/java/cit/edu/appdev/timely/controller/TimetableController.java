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

import cit.edu.appdev.timely.entity.TimetableEntity;
import cit.edu.appdev.timely.service.TimetableService;

@RestController
@RequestMapping("/timetable")
public class TimetableController {

    @Autowired
    TimetableService timetbl_service;

    @PostMapping("/insertTimetable")
    public TimetableEntity insertTimetable(@RequestBody TimetableEntity timetable) {
        return timetbl_service.insertTimetable(timetable);
    }

    @GetMapping("/getAllTimetables")
    public List<TimetableEntity> getAllTimetables() {
        return timetbl_service.getAllTimetables();
    }

    @PutMapping("/updateTimetable/{id}")
    public TimetableEntity updateTimetable(@PathVariable int id, @RequestBody TimetableEntity updatedTimetable) {
        return timetbl_service.updateTimetable(id, updatedTimetable);
    }

    @DeleteMapping("/deleteTimetable/{id}")
    public String deleteTimetable(@PathVariable int id) {
        return timetbl_service.deleteTimetable(id);
    }
}
