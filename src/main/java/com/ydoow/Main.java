package com.ydoow;

import java.time.LocalDateTime;

import com.ydoow.model.Teacher;
import com.ydoow.model.Section;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Teacher t1 = new Teacher(1, "ram","chris","yd@gmail.com","math",true);
        System.out.println(t1);
        Section s1 = new Section(1,"Grade 10 - faith", "grade 10","2024-2025",true);
        System.out.println(s1);

        t1.addSection(s1);
        System.out.println(t1);
        System.out.println(s1);

        for(Section section :t1.getSections()){
            System.out.println(section);
        }

    }
}