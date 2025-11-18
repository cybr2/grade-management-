package com.ydoow.services.base;

import java.util.*;

import com.ydoow.models.Student;

public interface StudenService {

    public Student create(String name);

    public Optional<Student> findById(Integer id);

    public List<Student> findAll();

    public List<Student> findBySectionId(Integer id);

    void delete(Integer id);

}
