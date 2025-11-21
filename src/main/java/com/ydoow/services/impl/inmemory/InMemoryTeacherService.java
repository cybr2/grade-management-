package com.ydoow.services.impl.inmemory;

import java.util.*;

import com.ydoow.models.Teacher;
import com.ydoow.repositories.inmemory.InMemoryTeacherRepository;
import com.ydoow.services.base.TeacherService;

public class InMemoryTeacherService implements TeacherService {
    
    private final InMemoryTeacherRepository teacherRepository;

    public InMemoryTeacherService(InMemoryTeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher create(String lastName, String firstName, String email, String subjectSpecialization, boolean active){

        boolean exists = teacherRepository.findAll().stream()
                .anyMatch(t -> t.getLastName().equalsIgnoreCase(lastName) && t.getFirstName().equalsIgnoreCase(firstName));
            
        if (exists) {
            throw new IllegalArgumentException("Teacher name already exists!");
        }

        Teacher newTeacher = new Teacher(lastName,firstName,email,subjectSpecialization,active);
        return teacherRepository.save(newTeacher);
            
    }
}