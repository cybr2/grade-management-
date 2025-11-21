package com.ydoow.teacher.mapper;

import com.ydoow.teacher.dto.internal.TeacherData;
import com.ydoow.teacher.model.Teacher;

public class TeacherMapper {

    // For CREATE
    public static Teacher toEntity(TeacherData data) {
        return new Teacher(
            data.getlastName(),
            data.getFirstName(),
            data.getEmail(),
            data.getSubjectSpecialization()
        );
    }

    // For UPDATE
    public static void applyUpdate(Teacher entity, TeacherData data) {
        entity.setFirstName(data.getFirstName());
        entity.setLastName(data.getlastName());
        entity.setEmail(data.getEmail());
        entity.setSubjectSpecialization(data.getSubjectSpecialization());
        entity.touch();
    }
}
