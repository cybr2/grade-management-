package com.ydoow.repositories.inmemory;

 import com.ydoow.models.Teacher;
import com.ydoow.repositories.base.TeacherRepository;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;



public class InMemoryTeacherRepository implements TeacherRepository {

    private final Map<Integer, Teacher> store = new HashMap<>();
    private final AtomicInteger idGenerator = new AtomicInteger();

    @Override
    public Teacher save(Teacher teacher){
        if(teacher.getId() == 0){
            teacher.setId(idGenerator.getAndIncrement());
        }
        store.put(teacher.getId(), teacher);
        return teacher;
    }

    @Override
    public Optional<Teacher> findById(Integer id){
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Teacher> findAll(){
        return new ArrayList<>(store.values());
    }

    @Override
    public boolean delete(Integer id) {
        return store.remove(id) != null;
    } 

}
