package edu.ntudp.pzks;

import edu.ntudp.pzks.LR_4.controller.*;
import edu.ntudp.pzks.LR_4.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonManagerTest {
    @Test
    public void testJsonSerialization() {
        University oldUniversity = createTestUniversity();
        String filename = "university.json";

        JsonManager.saveToJsonFile(oldUniversity, filename);
        University newUniversity = JsonManager.loadFromJsonFile(filename);

        assertEquals(oldUniversity.getName(), newUniversity.getName());
        assertEquals(oldUniversity.getHead().getFirstName(), newUniversity.getHead().getFirstName());
        assertEquals(oldUniversity.getFaculties().size(), newUniversity.getFaculties().size());
    }

    private University createTestUniversity() {
        Head universityHead = new Head("Іван", "Петров", "Олександрович", Sex.MALE);
        University university = new University("Національний університет", universityHead);

        Head facultyHead = new Head("Ольга", "Коваль", "Миколаївна", Sex.FEMALE);
        Faculty faculty = new Faculty("ФІТ", facultyHead);

        Head departmentHead = new Head("Сергій", "Лисенко", "Павлович", Sex.MALE);
        Department department = new Department("Програмна інженерія", "ПІ", departmentHead);

        Head groupHead = new Head("Марія", "Гриценко", "Іванівна", Sex.FEMALE);
        Group group = new Group("ПІ-2023-1", "ПІ", 2023, 1, groupHead);

        Student student1 = new Student("Андрій", "Мельник", "Володимирович", Sex.MALE);
        Student student2 = new Student("Катерина", "Шевченко", "Андріївна", Sex.FEMALE);

        group.addStudent(student1);
        group.addStudent(student2);
        department.addGroup(group);
        faculty.addDepartment(department);
        university.addFaculty(faculty);

        return university;
    }
}
