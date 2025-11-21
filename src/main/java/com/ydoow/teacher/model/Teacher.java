package com.ydoow.teacher.model;

import java.time.LocalDateTime;

import com.ydoow.utilities.DateTimeUtil;

public class Teacher {
    
    
    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String subjectSpecialization;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Teacher(int id, String lastName, String firstName, String email, String subjectSpecialization){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.subjectSpecialization = subjectSpecialization;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Teacher(String lastName, String firstName, String email, String subjectSpecialization){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.subjectSpecialization = subjectSpecialization;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }    
    
    // Getters 

    public Integer getId(){
        return id;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getEmail(){
        return email;
    }

    public String getSubjectSpecialization(){
        return subjectSpecialization;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubjectSpecialization(String subjectSpecialization) {
        this.subjectSpecialization = subjectSpecialization;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
}




    // Methods
    public String getName(){
        return firstName + " " + lastName;
    }

    public void touch() {
        this.updatedAt = LocalDateTime.now();
    }


    @Override
    public String toString(){
          return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + email + '\'' +
                ", subjectSpecialization='" + subjectSpecialization + '\'' +
                ", createdAt='" + DateTimeUtil.format(createdAt) + '\'' +
                ", upDatedAt='" + DateTimeUtil.format(updatedAt) + '\'' +
                '}';
    }

}
