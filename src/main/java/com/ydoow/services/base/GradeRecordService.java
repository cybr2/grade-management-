package com.ydoow.services.base;

import java.util.List;
import java.util.Optional;

import com.ydoow.models.GradeRecord;

public interface GradeRecordService {

    public GradeRecord create(String name);

    public Optional<GradeRecord> findById(Integer id);

    public List<GradeRecord> findAll();

    public List<GradeRecord> findBySectionId(Integer id);

    public List<GradeRecord> findByStudentId(Integer id);

    void delete(Integer id);
    
}
