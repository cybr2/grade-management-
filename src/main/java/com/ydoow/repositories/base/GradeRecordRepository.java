package com.ydoow.repositories.base;

import com.ydoow.models.GradeRecord;
import java.util.Optional;
import java.util.List;

public interface GradeRecordRepository {
    
    GradeRecord save(GradeRecord gradeRecord);

    Optional<GradeRecord> findById(Integer id);

    List<GradeRecord> findAll();

    List<GradeRecord> findBySectionId(Integer id);

    List<GradeRecord> findByStudentId(Integer id);

    boolean delete(Integer id);
}
