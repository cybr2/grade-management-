package com.ydoow.teacher.dto.request;

public class TeacherUpdateRequest {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String subjectSpecialization;

    public TeacherUpdateRequest(String firstName, String lastName, String email, String subjectSpecialization){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.subjectSpecialization=subjectSpecialization;
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
    
}
