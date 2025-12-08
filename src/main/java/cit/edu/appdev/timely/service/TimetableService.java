package cit.edu.appdev.timely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cit.edu.appdev.timely.entity.ScheduleEntity;
import cit.edu.appdev.timely.entity.TimetableEntity;
import cit.edu.appdev.timely.repository.ScheduleRepository;
import cit.edu.appdev.timely.repository.TimetableRepository;

@Service
public class TimetableService {

    @Autowired
    TimetableRepository timetbl_repository;

    public TimetableService() {
        super();
    }

     // CREATE in tbltable
    public TimetableEntity insertTimetable(TimetableEntity table) {
        return timetbl_repository.save(table);
    }

    // READ from tbltable
    public List<TimetableEntity> getAllTimetables() {
        return timetbl_repository.findAll();
    }

    
    // UPDATE - update existing table details
    public TimetableEntity updateTimetable(int id, TimetableEntity updatedTimetable){
        TimetableEntity existingTimetable = timetbl_repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Timetable not found with id: " + id));

        existingTimetable.setCourselist(updatedTimetable.getCourselist());

        return timetbl_repository.save(existingTimetable);
    }

    // DELETE - delete table
    public String deleteTimetable(int id) {
        if(!timetbl_repository.existsById(id)){
            throw new RuntimeException("Timetable not found with id: " + id);
        }

        timetbl_repository.deleteById(id);
        return "Timetable with ID" + id + " has been deleted successfully";
    }
}
