package com.ydoow.services.base;

import java.util.*;

import com.ydoow.models.Teacher;


public interface TeacherService {

    Teacher create(String name);

    Optional<Teacher> findById(Integer id);

    List<Teacher> findAll();

    Teacher update(Integer id, String newName);

    void delete(Integer id);

}
