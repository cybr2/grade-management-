package com.ydoow;

import java.time.LocalDateTime;

import com.ydoow.models.Section;
import com.ydoow.models.Student;
import com.ydoow.models.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Teacher t1 = new Teacher(1, "ram","chris","yd@gmail.com","math",true);
        System.out.println(t1);
        Section s1 = new Section(1,"Grade 10 - faith", "grade 10","2024-2025",true);
        System.out.println(s1);

        Student std1 = new Student(1,"0001","bern","yd", "bet","male","yd@gmail.com",true);
        System.out.println(std1);

        t1.addSection(s1);
        s1.addStudent(std1);
        System.out.println(t1);
        System.out.println(s1);
        System.out.println(std1);

        for(Section section :t1.getSections()){
            System.out.println(section);
        }

        for(Student student : s1.getStudents()){
            System.out.println(student);
        }

    }
}