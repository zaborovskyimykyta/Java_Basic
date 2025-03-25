package edu.ntudp.pzks.LR_4.controller;

import edu.ntudp.pzks.LR_4.model.Sex;
import edu.ntudp.pzks.LR_4.model.Student;


public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}

