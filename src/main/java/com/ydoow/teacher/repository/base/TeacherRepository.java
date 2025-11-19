package com.ydoow.teacher.repository.base;

import java.util.Optional;
import java.util.List;

import com.ydoow.teacher.model.Teacher;

public interface TeacherRepository {

    Teacher save(Teacher teacher);

    Optional<Teacher> findById(Integer id);

    List<Teacher> findAll();

    boolean delete(Integer id);

}
