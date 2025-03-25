package edu.ntudp.pzks.LR_3.main;


import edu.ntudp.pzks.LR_3.model.*;
import edu.ntudp.pzks.LR_3.controller.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity(
                "Національний технічний університет «Дніпровська політехніка»",
                new Head("Олександр", "Петров", "Миколайович", Sex.MALE)
        );

        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty fit = facultyCreator.createFaculty(
                "Факультет інформаційних технологій",
                new Head("Іван", "Сидоренко", "Васильович", Sex.MALE)
        );

        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department software = departmentCreator.createDepartment(
                "Програмне забезпечення", "ПЗ",
                new Head("Михайло", "Ковальчук", "Сергійович", Sex.MALE)
        );
        Department cyber = departmentCreator.createDepartment(
                "Кібербезпека", "КБ",
                new Head("Вікторія", "Шевченко", "Олегівна", Sex.FEMALE)
        );

        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Group group1 = groupCreator.createGroup("ПЗ-21-1", "ПЗ", 2021, 1,
                new Head("Юрій", "Бондаренко", "Іванович", Sex.MALE));
        group1.addStudent(studentCreator.createStudent("Олександр", "Іваненко", "Сергійович", Sex.MALE));
        group1.addStudent(studentCreator.createStudent("Марія", "Коваленко", "Олександрівна", Sex.FEMALE));
        group1.addStudent(studentCreator.createStudent("Дмитро", "Лисенко", "Віталійович", Sex.MALE));

        Group group2 = groupCreator.createGroup("ПЗ-21-2", "ПЗ", 2021, 2,
                new Head("Андрій", "Мельник", "Петрович", Sex.MALE));
        group2.addStudent(studentCreator.createStudent("Олена", "Шевчук", "Василівна", Sex.FEMALE));
        group2.addStudent(studentCreator.createStudent("Ігор", "Петренко", "Юрійович", Sex.MALE));
        group2.addStudent(studentCreator.createStudent("Катерина", "Семенова", "Андріївна", Sex.FEMALE));

        Group group3 = groupCreator.createGroup("КБ-21-1", "КБ", 2021, 1,
                new Head("Олена", "Кравчук", "Василівна", Sex.FEMALE));
        group3.addStudent(studentCreator.createStudent("Антон", "Романенко", "Михайлович", Sex.MALE));
        group3.addStudent(studentCreator.createStudent("Світлана", "Гордієнко", "Олексіївна", Sex.FEMALE));
        group3.addStudent(studentCreator.createStudent("Максим", "Дорошенко", "Ігорович", Sex.MALE));

        Group group4 = groupCreator.createGroup("КБ-21-2", "КБ", 2021, 2,
                new Head("Наталія", "Дмитренко", "Сергіївна", Sex.FEMALE));
        group4.addStudent(studentCreator.createStudent("Віктор", "Захаренко", "Євгенович", Sex.MALE));
        group4.addStudent(studentCreator.createStudent("Юлія", "Мартиненко", "Вікторівна", Sex.FEMALE));
        group4.addStudent(studentCreator.createStudent("Сергій", "Клименко", "Борисович", Sex.MALE));

        software.addGroup(group1);
        software.addGroup(group2);
        cyber.addGroup(group3);
        cyber.addGroup(group4);

        fit.addDepartment(software);
        fit.addDepartment(cyber);
        university.addFaculty(fit);

        System.out.println("Університет створено: " + university.getName());
    }
}
