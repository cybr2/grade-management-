package com.ydoow.repositories.inmemory;

import java.util.*;

import com.ydoow.repositories.base.StudentRepository;
import com.ydoow.models.Student;
import com.ydoow.utilities.IdGenerator;


public class InMemoryStudentRepository implements StudentRepository {
    private final Map<Integer, Student> store = new HashMap<>();

    @Override
    public Student save(Student student){
        if(student.getId() == 0){
            student.setId(IdGenerator.nextId(Student.class));
        }
        store.put(student.getId(),student);
        return student;
    }

    @Override
    public Optional<Student> findbyId(Integer id){
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Student> findAll(){
        return new ArrayList<>(store.values());
    }

    @Override
    public List<Student> findBySectionId(Integer id){
        List<Student> result = new ArrayList<>();
        for(Student student : store.values()){
            if(student.getSection() != null && student.getSection().getId() == id){
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public boolean delete(Integer id){
        return store.remove(id) != null;
    }
}
