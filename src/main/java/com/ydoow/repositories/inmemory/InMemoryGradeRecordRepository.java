package com.ydoow.repositories.inmemory;

import java.util.*;

import com.ydoow.models.GradeRecord;
import com.ydoow.repositories.base.GradeRecordRepository;
import com.ydoow.utilities.IdGenerator;

public class InMemoryGradeRecordRepository implements GradeRecordRepository {
    
    private final Map<Integer, GradeRecord> store = new HashMap<>();

    @Override
    public GradeRecord save(GradeRecord gradeRecord){
        if(gradeRecord.getId() == 0){
            gradeRecord.setId(IdGenerator.nextId(GradeRecord.class));
        }
        store.put(gradeRecord.getId(), gradeRecord);
        return gradeRecord;
    }

    @Override
    public Optional<GradeRecord> findById(Integer id){
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<GradeRecord> findAll(){
        return new ArrayList<>(store.values());
    }

    @Override
    public List<GradeRecord> findBySectionId(Integer id){
        List<GradeRecord> result = new ArrayList<>();

        for(GradeRecord gradeRecord: store.values()){
            if(gradeRecord.getSection() != null && gradeRecord.getSection().getId() == id){
                result.add(gradeRecord);
            }
        }
        return result;
    }

    @Override
    public List<GradeRecord> findByStudentId(Integer id){
        List<GradeRecord> result = new ArrayList<>();

        for(GradeRecord  gradeRecord : store.values()){
            if(gradeRecord.getStudent() != null && gradeRecord.getStudent().getId() == id){
                result.add(gradeRecord);
            }
        }
        return result;
    }

    @Override
    public boolean delete(Integer id){
        return store.remove(id) != null;
    }

}
