package com.ydoow.teacher.service.impl;

import java.util.List;
import java.util.Optional;

import com.ydoow.teacher.dto.internal.TeacherData;
import com.ydoow.teacher.mapper.TeacherMapper;
import com.ydoow.teacher.model.Teacher;
import com.ydoow.teacher.repository.base.TeacherRepository;
import com.ydoow.teacher.service.base.TeacherService;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
 
    @Override
    public Teacher create(TeacherData teacherData) {

        if (emailExists(teacherData.getEmail())) {
            throw new IllegalArgumentException("Email already exists: " + teacherData.getEmail());
        }
        

        Teacher teacher = TeacherMapper.toEntity(teacherData);
        return teacherRepository.save(teacher);
    }

    @Override
    public Optional<Teacher> findById(Integer id){
        return teacherRepository.findById(id);
    }

    @Override
    public List<Teacher> findAll(){
        return teacherRepository.findAll();
    }

    @Override
    public Teacher update(Integer id, TeacherData data){
        Teacher existing = teacherRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Teacher not found" + id));

        existing.setFirstName(data.getFirstName());
        existing.setLastName(data.getLastName());
        existing.setEmail(data.getEmail());
        // existing.setId(data.getId()); // This line is removed as it references undefined variables
        existing.setSubjectSpecialization(data.getSubjectSpecialization());
        existing.touch();

        return teacherRepository.save(existing);
    }

    @Override
    public boolean emailExists(String email) {
        return teacherRepository.findAll()
                .stream()
                .anyMatch(t -> t.getEmail().equalsIgnoreCase(email));
    }

    @Override
    public boolean delete(Integer id){
        if(teacherRepository.findById(id).isEmpty()) return false;
        teacherRepository.delete(id);
        return true;
    }

}
