package com.mycompany.oopsconcept;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StudentProcessor {
    public static List<Student> filterByGender(List<Student> students, String gender) {
        return students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase(gender))
                .collect(Collectors.toList());
    }

    public static List<LocalDate> getDateOfBirthOfMaleStudents(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("male"))
                .map(Student::getDateOfBirth)
                .collect(Collectors.toList());
    }

    public static int getTotalMarks(List<Student> students) {
        return students.stream()
                .flatMapToInt(student -> student.getMarks().stream().mapToInt(Integer::intValue))
                .reduce(0, Integer::sum);
    }

    public static List<Integer> getAllMarks(List<Student> students) {
        return students.stream()
                .flatMap(s -> s.getMarks().stream())
                .collect(Collectors.toList());
    }

    public static String getFirstMaleStudentName(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("male"))
                .findFirst()
                .map(Student::getName)
                .orElse("No male students found.");
    }

    public static String getFirstStudentWithLessThan40Marks(List<Student> students) {
        return students.stream()
                .filter(s -> s.getMarks().stream().anyMatch(mark -> mark < 40))
                .findFirst()
                .map(Student::getName)
                .orElseThrow(() -> new RuntimeException("No student found with less than 40 marks."));
    }

    public static void printStudentDetails(List<Student> students) {
        students.forEach(s -> System.out.println("Name: " + s.getName() + " Marks: " + s.getMarks()));
    }
}

