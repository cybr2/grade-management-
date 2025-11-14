package com.ydoow.repositories.base;

import java.util.List;
import java.util.Optional;

import com.ydoow.models.Teacher;

public interface TeacherRepository {

    Teacher save(Teacher teacher);

    Optional<Teacher> findById(Long id);

    List<Teacher> findAll();

    void delete(Long id);
    
}
