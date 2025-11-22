package com.ydoow.teacher.controller;

import java.util.List;

import com.ydoow.teacher.dto.request.TeacherCreateRequest;
import com.ydoow.teacher.dto.request.TeacherUpdateRequest;
import com.ydoow.teacher.dto.response.TeacherListResponse;
import com.ydoow.teacher.dto.response.TeacherResponse;
import com.ydoow.teacher.model.Teacher;
import com.ydoow.teacher.dto.internal.TeacherData;
import com.ydoow.teacher.mapper.TeacherMapper;
import com.ydoow.teacher.service.base.TeacherService;

public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    /** CREATE */
    public TeacherResponse create(TeacherCreateRequest req) {
        // Convert request DTO → internal DTO
        TeacherData data = TeacherMapper.toInternal(req);
        // Call service → returns entity → map to response DTO
        return TeacherMapper.toResponse(teacherService.create(data));
    }

    /** UPDATE */
    public TeacherResponse update(Integer id, TeacherUpdateRequest req) {
        // Convert request DTO → internal DTO (without setting id)
        TeacherData data = TeacherMapper.toInternal(req);
        // Service uses the id separately
        return TeacherMapper.toResponse(teacherService.update(id, data));
    }

    /** GET BY ID */
    public TeacherResponse get(Integer id) {
        return teacherService.findById(id)
                .map(TeacherMapper::toResponse)
                .orElse(null);
    }

    /** LIST ALL */
    public TeacherListResponse list() {
        // get all teachers from service
        List<Teacher> teachers = teacherService.findAll();

        // map the whole list at once
        return TeacherMapper.toList(teachers);
    }

    /** DELETE */
    public boolean delete(Integer id) {
        return teacherService.delete(id);
    }
}
