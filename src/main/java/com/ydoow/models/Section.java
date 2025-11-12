package com.ydoow.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ydoow.utilities.DateTimeUtil;

public class Section {
    private int id;
    private String name;
    private String gradeLevel;
    private String schoolYear;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Teacher teacher;
    private List<Student> students = new ArrayList<>();


    public Section(int id, String name, String gradeLevel, String schoolYear,  boolean active){
        this.id = id;
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.schoolYear = schoolYear;
        this.active = active;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getGradeLevel(){
        return gradeLevel;
    }

    public String getSchoolYear(){
        return schoolYear;
    }

    public boolean isActive(){
        return active;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }

    public void setSchoolYear(String schoolYear){
        this.schoolYear = schoolYear;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public void setUpdatedAt(LocalDateTime upDatedAt){
        this.updatedAt  = upDatedAt;
    }


    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        if(student != null && !students.contains(student)){
            students.add(student);
            student.setSection(this);
        }
    }

    public void removeStudent(Student student){
        if(student != null && students.remove(student)){
            student.setSection(null);
        }
    }
    
    @Override
    public String toString(){
        return "Section{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", gradeLevel='" + gradeLevel + '\'' +
            ", schoolYear='" + schoolYear + '\'' +
            ", teacher=" + (teacher != null ? teacher.getFirstName()  + " " + teacher.getLastName(): "None") +
            ", students=" + students.size() +
            ", active=" + active +
            ", createdAt='" + DateTimeUtil.format(createdAt) + '\'' +
            ", updatedAt='" + DateTimeUtil.format(updatedAt) + '\'' +
            '}';
    }
}
