package com.ydoow;

import com.ydoow.teacher.controller.TeacherController;
import com.ydoow.teacher.repository.inmemory.InMemoryTeacherRepository;
import com.ydoow.teacher.service.impl.TeacherServiceImpl;
import com.ydoow.teacher.view.TeacherConsoleView;

public class Main {
    public static void main(String[] args) {
        // Setup
        var repository = new InMemoryTeacherRepository();
        var service = new TeacherServiceImpl(repository);
        var controller = new TeacherController(service);
        var view = new TeacherConsoleView(controller);

        // Start console view
        view.run();
    }
}
