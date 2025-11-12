package com.ydoow.models;

import java.time.LocalDateTime;
import com.ydoow.utilities.DateTimeUtil;

public class Student {
    private int id;
    private String studentNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private String gender;
    private String email;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Section section;

    public Student(int id, String studentNumber, String lastName, String firstName, String middleName, String gender, String email, boolean active){
        this.id = id;
        this.studentNumber = studentNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.email = email;
        this.active = active;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getId(){
        return id;
    }

    public String getStudentNumber(){
        return studentNumber;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getGender(){
        return gender;
    }

    public String getEmail(){
        return email;
    }

    public boolean isActive(){
        return active;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

    
    public Section getSection(){
        return section;
    }

    public void setSection(Section section){
        this.section = section;
    }


    @Override
    public String toString(){
        return "Student{" +
            "id=" + id +
            ", studentNumber='" + studentNumber + '\'' +
            ", name='" + firstName + " " + middleName + " " + lastName + '\'' +
            ", gender='" + gender + '\'' +
            ", email='" + email + '\'' +
            ", section='" + (section != null ? section.getName() : "N/A") + '\'' +
            ", active=" + active +
            ", createdAt='" + DateTimeUtil
            .format(createdAt) + '\'' +
            ", updatedAt='" + DateTimeUtil.format(updatedAt) + '\'' +
            '}';
    }





}
