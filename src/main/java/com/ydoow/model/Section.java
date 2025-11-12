package com.ydoow.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Section {
    private int id;
    private String name;
    private String gradeLevel;
    private String schoolYear;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Teacher teacher;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

    public Section(int id, String name, String gradeLevel, String schoolYear,  boolean active){
        this.id = id;
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.schoolYear = schoolYear;
        this.active = active;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getId(int id){
        return id;
    }

    public String getName(String name){
        return name;
    }

    public String getGradeLevel(String gradeLevel){
        return gradeLevel;
    }

    public String getScoolYear(String schoolYear){
        return schoolYear;
    }

    public boolean isActive(boolean active){
        return active;
    }

    public LocalDateTime getCreatedAt(LocalDateTime createdAt){
        return createdAt;
    }

    public LocalDateTime getUpdatedAt(LocalDateTime updatedAt){
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

    public void setScoolYear(String schoolYear){
        this.schoolYear = schoolYear;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime upDatedAt){
        this.updatedAt  = upDatedAt;
    }


    public Teacher getTeacher(Teacher teacher){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    
    @Override
    public String toString(){
        return "Section{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", gradeLevel='" + gradeLevel + '\'' +
            ", schoolYear='" + schoolYear + '\'' +
            ", teacher=" + (teacher != null ? teacher.getFirstName()  + " " + teacher.getLastName(): "None") +
            ", active=" + active +
            ", createdAt='" + createdAt.format(formatter) + '\'' +
            ", updatedAt='" + updatedAt.format(formatter) + '\'' +
            '}';
    }
}
