package com.ydoow.teacher.service.base;

import java.util.Optional;
import java.util.List;

import com.ydoow.teacher.dto.internal.TeacherData;
import com.ydoow.teacher.model.Teacher;

public interface TeacherService {

    Teacher create(TeacherData teacher);

    // Optional<Teacher> findById(Integer id);

    // List<Teacher> findAll();

    // Teacher update(Integer id,TeacherData updatedData);

    // boolean delete(Integer id);

    boolean emailExists(String email);
}