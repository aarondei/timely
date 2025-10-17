package cit.edu.appdev.timely.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cit.edu.appdev.timely.entity.ScheduleEntity;
import cit.edu.appdev.timely.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService sched_service;

    @PostMapping("/insertSchedule")
    public ScheduleEntity insertSchedule(@RequestBody ScheduleEntity schedule) {
        return sched_service.insertSchedule(schedule);
    }

    @GetMapping("/getAllSchedule")
    public List<ScheduleEntity> getAllSchedules() {
        return sched_service.getAllSchedules();
    }
}
