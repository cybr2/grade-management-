package com.ydoow.teacher.view;

import java.util.List;
import java.util.Scanner;

import com.ydoow.teacher.controller.TeacherController;
import com.ydoow.teacher.dto.request.TeacherCreateRequest;
import com.ydoow.teacher.dto.request.TeacherUpdateRequest;
import com.ydoow.teacher.dto.response.TeacherListResponse;
import com.ydoow.teacher.dto.response.TeacherResponse;

public class TeacherConsoleView {

    private final TeacherController controller;
    private final Scanner scanner;

    public TeacherConsoleView(TeacherController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> createTeacher();
                case 2 -> updateTeacher();
                case 3 -> getTeacher();
                case 4 -> listTeachers();
                case 5 -> deleteTeacher();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n=== Teacher Management ===");
        System.out.println("1. Create Teacher");
        System.out.println("2. Update Teacher");
        System.out.println("3. Get Teacher by ID");
        System.out.println("4. List All Teachers");
        System.out.println("5. Delete Teacher");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private void createTeacher() {
        System.out.println("\n--- Create Teacher ---");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Subject Specialization: ");
        String subject = scanner.nextLine();

        TeacherCreateRequest req = new TeacherCreateRequest(firstName, lastName, email, subject);
        try {
            TeacherResponse resp = controller.create(req);
            System.out.println("Created: " + resp.getFirstName() + " " + resp.getLastName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void updateTeacher() {
        System.out.println("\n--- Update Teacher ---");
        System.out.print("Teacher ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Subject Specialization: ");
        String subject = scanner.nextLine();

        TeacherUpdateRequest req = new TeacherUpdateRequest(firstName, lastName, email, subject);
        try {
            TeacherResponse resp = controller.update(id, req);
            System.out.println("Updated: " + resp);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void getTeacher() {
        System.out.print("\nTeacher ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        TeacherResponse resp = controller.get(id);
        if (resp != null) {
            System.out.println(resp);
        } else {
            System.out.println("Teacher not found.");
        }
    }

    private void listTeachers() {
        System.out.println("\n--- Teacher List ---");
        TeacherListResponse listResp = controller.list();
        System.out.println("Total: " + listResp.getTotal());
        for (TeacherResponse t : listResp.getTeachers()) {
            System.out.println(t);
        }
    }

    private void deleteTeacher() {
        System.out.print("\nTeacher ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean deleted = controller.delete(id);
        System.out.println(deleted ? "Deleted successfully." : "Teacher not found.");
    }
}
