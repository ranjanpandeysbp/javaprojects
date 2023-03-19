package com.mycompany.oopsconcept;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private String name;
    private LocalDate dateOfBirth;
    private String gender;
    private List<Integer> marks;

    public Student(String name, LocalDate dateOfBirth, String gender, List<Integer> marks) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}

