package cit.edu.appdev.timely.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cit.edu.appdev.timely.entity.ScheduleEntity;
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
}
