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

    public int getId(){
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
    public int setId(int id){
        return this.id = id;
    }

    public String setLastName(String lastName){
        return this.lastName = lastName;
    }

    public String setFirstName(String firstName){
        return this.firstName = firstName;
    }

    public String setEmail(String email){
        return this.email = email;
    }

    public String setSubjectSpecialization(String subjectSpecialization){
        return this.subjectSpecialization = subjectSpecialization;
    }

    public LocalDateTime setUpdatedAt(LocalDateTime updatedAt){
        return this.updatedAt = updatedAt;
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
