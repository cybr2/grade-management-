package com.ydoow.teacher.dto.request;

public class TeacherCreateRequest {

    private final String lastName;
    private final String firstName;
    private final String email;
    private final String subjectSpecialization;

    public TeacherCreateRequest(String lastName,String firstName,String email,String subjectSpecialization){
        this.lastName=lastName;
        this.firstName=firstName;
        this.email=email;
        this.subjectSpecialization=subjectSpecialization;
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
}
