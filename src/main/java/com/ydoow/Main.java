package com.ydoow;

import java.time.LocalDateTime;

import com.ydoow.model.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Teacher t1 = new Teacher(1, "ram","chris","yd@gmail.com","math",true,LocalDateTime.now(),LocalDateTime.now());
        System.out.println(t1);
    }
}