package com.ydoow.teacher.dto.internal;

import java.time.LocalDateTime;

public class TeacherData {

    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String subjectSpecialization;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TeacherData(int id, String lastName, String firstName, String email, String subjectSpecialization, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.subjectSpecialization = subjectSpecialization;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters & Setters 
    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getlastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getSubjectSpecialization(){
        return subjectSpecialization;
    }
    public void setSubjectSpecialization(String subjectSpecialization){
        this.subjectSpecialization = subjectSpecialization;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

}
