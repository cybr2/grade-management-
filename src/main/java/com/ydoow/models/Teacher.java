package com.ydoow.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ydoow.utilities.DateTimeUtil;

public class Teacher {
    
    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String subjectSpecialization;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<Section> sections = new ArrayList<>();

    public Teacher(String lastName, String firstName, String email, String subjectSpecialization, boolean active){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.subjectSpecialization = subjectSpecialization;
        this.active = active;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Teacher(int id, String lastName, String firstName, String email, String subjectSpecialization, boolean active){
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

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Section> getSections(){
        return sections;
    }

    public void addSection(Section section){
        if(section != null && !sections.contains(section)){
            sections.add(section);
            section.setTeacher(this);
        }
    }

    public void removeSection(Section section){
        if(section != null && sections.remove(section)){
            section.setTeacher(null);
        }
    }

    @Override
    public String toString(){
          return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + firstName + " " + lastName + '\'' +
                ", email='" + email + '\'' +
                ", subjectSpecialization='" + subjectSpecialization + '\'' +
                ", sections='" + sections.size() + '\'' +
                ", active=" + active +
                ", createdAt='" + DateTimeUtil.format(createdAt) + '\'' +
                ", upDatedAt='" + DateTimeUtil.format(updatedAt) + '\'' +
                '}';
    }

    

}
