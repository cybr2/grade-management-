package com.ydoow.teacher.service.impl;

import java.util.List;
import java.util.Optional;

import com.ydoow.teacher.dto.internal.TeacherData;
import com.ydoow.teacher.mapper.TeacherMapper;
import com.ydoow.teacher.model.Teacher;
import com.ydoow.teacher.repository.inmemory.InMemoryTeacherRepository;
import com.ydoow.teacher.service.base.TeacherService;

public class TeacherServiceImpl implements TeacherService {

    private final InMemoryTeacherRepository inMemoryTeacherRepository;

    public TeacherServiceImpl(InMemoryTeacherRepository inMemoryTeacherRepository) {
        this.inMemoryTeacherRepository = inMemoryTeacherRepository;
    }

    @Override
    public Teacher create(TeacherData teacherData) {

        if (emailExists(teacherData.getEmail())) {
            throw new IllegalArgumentException("Email already exists: " + teacherData.getEmail());
        }

        Teacher teacher = TeacherMapper.toEntity(teacherData);
        return inMemoryTeacherRepository.save(teacher);
    }

    @Override
    public boolean emailExists(String email) {
        return inMemoryTeacherRepository.findAll()
                .stream()
                .anyMatch(t -> t.getEmail().equalsIgnoreCase(email));
    }

}
