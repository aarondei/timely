package cit.edu.appdev.timely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cit.edu.appdev.timely.entity.ScheduleEntity;
import cit.edu.appdev.timely.entity.UserEntity;
import cit.edu.appdev.timely.repository.ScheduleRepository;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository sched_repository;

    public ScheduleService() {
        super();
    }

    // CREATE in tblSchedule
    public ScheduleEntity insertSchedule(ScheduleEntity schedule) {
        return sched_repository.save(schedule);
    }

    // READ from tblSchedule
    public List<ScheduleEntity> getAllSchedules() {
        return sched_repository.findAll();
    }

    
    // UPDATE - update existing sched details
    public ScheduleEntity updateSchedule(int id, ScheduleEntity updatedSchedule){
        ScheduleEntity existingSchedule = sched_repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Schedule not found with id: " + id));

        existingSchedule.setSection(updatedSchedule.getSection());
        existingSchedule.setRoom(updatedSchedule.getRoom());
        existingSchedule.setTeacher(updatedSchedule.getTeacher());
        existingSchedule.setDay(updatedSchedule.getDay());
        existingSchedule.setStudentNumber(updatedSchedule.getStudentNumber());

        return sched_repository.save(existingSchedule);
    }

    // DELETE - delete sched
    public String deleteSchedule(int id) {
        if(!sched_repository.existsById(id)){
            throw new RuntimeException("Schedule not found with id: " + id);
        }

        sched_repository.deleteById(id);
        return "Schedule with ID" + id + "has been deleted successfully";
    }
}
