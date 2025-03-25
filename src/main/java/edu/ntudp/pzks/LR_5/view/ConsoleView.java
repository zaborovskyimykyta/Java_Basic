package edu.ntudp.pzks.LR_5.view;

import edu.ntudp.pzks.LR_5.controller.StudentController;
import edu.ntudp.pzks.LR_5.model.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private final StudentController studentController;
    private final Scanner scanner;

    public ConsoleView() {
        studentController = new StudentController();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n1. Get students by birth month");
            System.out.println("2. Add a new student");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> getStudentsByMonth();
                case 2 -> addStudent();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void getStudentsByMonth() {
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = studentController.getStudentsByMonth(month);
        if (students.isEmpty()) {
            System.out.println("No students found for this month.");
        } else {
            students.forEach(System.out::println);
        }
    }

    private void addStudent() {
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Birth date (YYYY-MM-DD): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Record book number: ");
        String recordBookNumber = scanner.nextLine();

        Student student = new Student(lastName, firstName, middleName, birthDate, recordBookNumber);
        studentController.addStudent(student);
    }
}
