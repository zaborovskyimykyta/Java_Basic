package edu.ntudp.pzks.LR_3.controller;

import edu.ntudp.pzks.LR_3.model.Sex;
import edu.ntudp.pzks.LR_3.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        return new Student(firstName, lastName, patronymic, sex);
    }
}

