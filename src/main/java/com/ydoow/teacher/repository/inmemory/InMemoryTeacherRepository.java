package com.ydoow.teacher.repository.inmemory;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.ydoow.teacher.model.Teacher;
import com.ydoow.teacher.repository.base.TeacherRepository;
import com.ydoow.utilities.IdGenerator;

public class InMemoryTeacherRepository implements TeacherRepository {

    private final Map<Integer,Teacher> store = new HashMap<>();

    @Override
    public Teacher save(Teacher teacher){
        if(teacher.getId() == 0){
            teacher.setId(IdGenerator.nextId(Teacher.class));
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
    public boolean delete(Integer id){
        return store.remove(id) != null;
    }

}
