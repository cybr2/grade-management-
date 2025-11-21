package com.ydoow.services.base;

import java.util.*;

import com.ydoow.models.Teacher;
import com.ydoow.dto.service.teacher.CreateTeacherCommand;
import com.ydoow.dto.service.teacher.TeacherData;

public interface TeacherService {

    Teacher create(String lastName, String firstName, String email, String subjectSpecialization, boolean active);

    Optional<Teacher> findById(Integer id);

    List<Teacher> findAll();

    Teacher update(Integer id, String newName);

    void delete(Integer id);

}
