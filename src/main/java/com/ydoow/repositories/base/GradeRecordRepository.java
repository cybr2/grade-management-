package com.ydoow.repositories.base;

import com.ydoow.models.GradeRecord;
import java.util.Optional;
import java.util.List;

public interface GradeRecordRepository {
    
    GradeRecord save(GradeRecord gradeRecord);

    Optional<GradeRecord> findById(Long id);

    List<GradeRecord> findAll();

    List<GradeRecord> findByStudentId(Long id);

    void delete(Long id);
}
