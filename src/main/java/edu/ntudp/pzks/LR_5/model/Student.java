package edu.ntudp.pzks.LR_5.model;

import java.time.LocalDate;


public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String recordBookNumber;

    public Student(int id, String lastName, String firstName, String middleName, LocalDate birthDate, String recordBookNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.recordBookNumber = recordBookNumber;
    }

    public Student(String lastName, String firstName, String middleName, LocalDate birthDate, String recordBookNumber) {
        this(0, lastName, firstName, middleName, birthDate, recordBookNumber);
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + " (" + birthDate + ") - " + recordBookNumber;
    }
}
