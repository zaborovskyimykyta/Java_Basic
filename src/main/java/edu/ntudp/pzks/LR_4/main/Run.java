package edu.ntudp.pzks.LR_4.main;


import edu.ntudp.pzks.LR_4.controller.*;
import edu.ntudp.pzks.LR_4.model.*;


public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println("Університет створено: " + university.getName());
    }

    public static University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Head universityHead = new Head("Іван", "Петров", "Миколайович", Sex.MALE);
        University university = universityCreator.createUniversity("Національний університет", universityHead);

        Head facultyHead = new Head("Ольга", "Сидоренко", "Василівна", Sex.FEMALE);
        Faculty fit = facultyCreator.createFaculty("Факультет інформаційних технологій", facultyHead);

        Head departmentHead1 = new Head("Андрій", "Коваленко", "Ігорович", Sex.MALE);
        Department department1 = departmentCreator.createDepartment("Кафедра програмної інженерії", "КПІ", departmentHead1);

        Head departmentHead2 = new Head("Марина", "Захарченко", "Олександрівна", Sex.FEMALE);
        Department department2 = departmentCreator.createDepartment("Кафедра інформаційних систем", "КІС", departmentHead2);

        Head groupHead1 = new Head("Василь", "Луценко", "Сергійович", Sex.MALE);
        Group group1 = groupCreator.createGroup("КПІ-2023-1", "КПІ", 2023, 1, groupHead1);
        group1.addStudent(studentCreator.createStudent("Олексій", "Гончар", "Олександрович", Sex.MALE));
        group1.addStudent(studentCreator.createStudent("Наталія", "Мельник", "Андріївна", Sex.FEMALE));

        Head groupHead2 = new Head("Світлана", "Романенко", "Миколаївна", Sex.FEMALE);
        Group group2 = groupCreator.createGroup("КПІ-2023-2", "КПІ", 2023, 2, groupHead2);
        group2.addStudent(studentCreator.createStudent("Ірина", "Кравець", "Юріївна", Sex.FEMALE));
        group2.addStudent(studentCreator.createStudent("Дмитро", "Бондар", "Євгенович", Sex.MALE));

        department1.addGroup(group1);
        department1.addGroup(group2);

        Head groupHead3 = new Head("Сергій", "Петренко", "Вікторович", Sex.MALE);
        Group group3 = groupCreator.createGroup("КІС-2023-1", "КІС", 2023, 1, groupHead3);
        group3.addStudent(studentCreator.createStudent("Марина", "Шевченко", "Олегівна", Sex.FEMALE));
        group3.addStudent(studentCreator.createStudent("Антон", "Даниленко", "Петрович", Sex.MALE));

        Head groupHead4 = new Head("Юлія", "Гриценко", "Василівна", Sex.FEMALE);
        Group group4 = groupCreator.createGroup("КІС-2023-2", "КІС", 2023, 2, groupHead4);
        group4.addStudent(studentCreator.createStudent("Олег", "Семенов", "Іванович", Sex.MALE));
        group4.addStudent(studentCreator.createStudent("Тетяна", "Лисенко", "Михайлівна", Sex.FEMALE));

        department2.addGroup(group3);
        department2.addGroup(group4);

        fit.addDepartment(department1);
        fit.addDepartment(department2);

        university.addFaculty(fit);

        return university;
    }
}
