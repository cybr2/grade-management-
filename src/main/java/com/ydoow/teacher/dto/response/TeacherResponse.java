package com.ydoow.teacher.dto.response;

public class TeacherResponse {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String subjectSpecialization;
    
        public TeacherResponse(Integer id, String firstName, String lastName, String email, String subjectSpecialization){
            this.id=id;
            this.firstName=firstName;
            this.lastName=lastName;
            this.email=email;
            this.subjectSpecialization=subjectSpecialization;
        }

        public Integer getId(){
            return id;
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
