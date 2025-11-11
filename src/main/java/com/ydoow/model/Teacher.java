package com.ydoow.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teacher {
    
    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String subjectSpecialization;
    private boolean active;
    // private List<Section> sections;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Teacher(int id, String lastName, String firstName, String email, String subjectSpecialization, boolean active, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.subjectSpecialization = subjectSpecialization;
        this.active = active;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getSubjectSpecialization() {
        return subjectSpecialization;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(int id) {
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

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

    @Override
    public String toString(){
          return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + firstName + " " + lastName + '\'' +
                ", email='" + email + '\'' +
                ", subjectSpecialization='" + subjectSpecialization + '\'' +
                ", active=" + active +
                ", createdAt='" + createdAt.format(formatter) + '\'' +
                ", createdAt='" + updatedAt.format(formatter) + '\'' +
                '}';
    }

    

}
