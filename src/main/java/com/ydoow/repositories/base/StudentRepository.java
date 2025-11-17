package com.ydoow.repositories.base;

import com.ydoow.models.Student;
import java.util.Optional;
import java.util.List;

public interface StudentRepository {
    
    Student save(Student student);

    Optional<Student> findbyId(Integer id);

    List<Student> findAll();

    List<Student> findBySectionId(Integer sectionId);

    boolean delete(Integer id);
    
}
