package com.ydoow.dto.service.teacher;

public class CreateTeacherCommand {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String subjectSpecialization;
    private final boolean active;

    public  CreateTeacherCommand(String firstName, String lastName, String email, String subjectSpecialization, boolean active){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.subjectSpecialization = subjectSpecialization;
        this.active = active;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastname(){
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
}
