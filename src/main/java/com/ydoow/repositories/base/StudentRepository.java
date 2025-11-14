package com.ydoow.repositories.base;

import com.ydoow.models.Student;
import java.util.Optional;
import java.util.List;

public interface StudentRepository {
    
    Student save(Student student);

    Optional<Student> findbyId(Long id);

    List<Student> findAll();

    List<Student> findBySectionId(Long sectionId);

    void delete(Long id);
    
}
