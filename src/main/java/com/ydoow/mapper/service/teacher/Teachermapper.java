package com.ydoow.mapper.service.teacher;

import com.ydoow.models.Teacher;

import java.time.LocalDateTime;

import com.ydoow.dto.service.teacher.CreateTeacherCommand;
import com.ydoow.dto.service.teacher.TeacherData;

public class Teachermapper {

    public static Teacher toEntity(CreateTeacherCommand command){
        return new Teacher(
            command.getFirstName(),
            command.getLastname(),
            command.getEmail(),
            command.getSubjectSpecialization(),
            command.isActive()
        );
    }

    public static TeacherData toData(Teacher teacher){
        return new TeacherData(
            teacher.getId(),
            teacher.getFirstName(),
            teacher.getLastName(),
            teacher.getEmail(),
            teacher.getSubjectSpecialization(),
            teacher.isActive(),
            teacher.getCreatedAt() != null ? teacher.getCreatedAt() : LocalDateTime.now()
        );
    }
    
}
