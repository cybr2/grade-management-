package com.ydoow.teacher.dto.response;

import java.util.List;

public class TeacherListResponse {
    private final Integer total;
    private final List<TeacherResponse> teachers;

    public TeacherListResponse(int total, List<TeacherResponse> teachers){
        this.total=total;
        this.teachers = teachers;
    }

    public Integer getTotal(){
        return total;
    }
    public List<TeacherResponse> getTeachers(){
        return teachers;
    }
   
}
