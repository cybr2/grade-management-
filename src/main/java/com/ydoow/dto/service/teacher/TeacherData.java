package com.ydoow.dto.service.teacher;

import java.time.LocalDateTime;

public class TeacherData {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String subjectSpecialization;
    private final boolean active;
    private final LocalDateTime createdAt;

    public TeacherData(Integer id, String firstName, String lastName, String email, String subjectSpecialization, boolean active, LocalDateTime createdAt){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.subjectSpecialization = subjectSpecialization;
        this.active = active;
        this.createdAt = createdAt;
    }

    public Integer getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getSubjectSpecialization(){
        return subjectSpecialization;
    }

    public boolean isActive(){
        return active;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
}
