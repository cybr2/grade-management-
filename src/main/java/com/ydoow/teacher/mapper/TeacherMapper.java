package com.ydoow.teacher.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.ydoow.teacher.dto.internal.TeacherData;
import com.ydoow.teacher.dto.request.TeacherCreateRequest;
import com.ydoow.teacher.dto.request.TeacherUpdateRequest;
import com.ydoow.teacher.dto.response.TeacherResponse;
import com.ydoow.teacher.dto.response.TeacherListResponse;
import com.ydoow.teacher.model.Teacher;

public class TeacherMapper {

    public static TeacherData toInternal(TeacherCreateRequest request){
        return new TeacherData(request.getLastName(), request.getFirstName(), request.getEmail(), request.getSubjectSpecialization());
    }

    public static TeacherData toInternal(TeacherUpdateRequest request){
        return new TeacherData(request.getLastName(), request.getFirstName(), request.getEmail(), request.getSubjectSpecialization());
    }

    public static Teacher toEntity(TeacherData data){
        return new Teacher(data.getLastName(), data.getFirstName(), data.getEmail(), data.getSubjectSpecialization());
    }

    public static TeacherResponse toResponse(Teacher teacher){
        return new TeacherResponse(teacher.getId(), teacher.getFirstName(), teacher.getLastName(), teacher.getEmail(), teacher.getSubjectSpecialization());
    }

    public static TeacherListResponse toList(List<Teacher> teachers){
        List<TeacherResponse> items = teachers.stream().map(TeacherMapper::toResponse).collect(Collectors.toList());
        return new TeacherListResponse(items.size(), items);
    }
}
