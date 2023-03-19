package com.mycompany.oopsconcept;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static com.mycompany.oopsconcept.StudentProcessor.*;

public class Main {

    public static void main(String[] args) {

        // Create a list of students and populate it with sample data
        List<Student> students = Arrays.asList(
                new Student("Alice", LocalDate.of(2000, Month.AUGUST, 10), "Female", Arrays.asList(75, 80, 85)),
                new Student("Bob", LocalDate.of(2001, Month.JANUARY, 15), "Male", Arrays.asList(70, 65, 80)),
                new Student("Charlie", LocalDate.of(2002, Month.MAY, 20), "Male", Arrays.asList(90, 85, 80)),
                new Student("Diana", LocalDate.of(2000, Month.MARCH, 5), "Female", Arrays.asList(95, 90, 100)),
                new Student("Emily", LocalDate.of(2001, Month.DECEMBER, 25), "Female", Arrays.asList(85, 75, 95)),
                new Student("Frank", LocalDate.of(2002, Month.OCTOBER, 1), "Male", Arrays.asList(80, 75, 85))
        );

        // Use the filter operator to get all female students and print their names
        System.out.println("Female Students:");
        filterByGender(students, "female")
                .forEach(student -> System.out.println(student.getName()));

        // Use the map operator to get the date of birth of all male students and print them
        System.out.println("\nDate of Birth of Male Students:");
        getDateOfBirthOfMaleStudents(students)
                .forEach(System.out::println);

        // Use the reduce operator to get the total marks of all students and print the result
        int totalMarks = getTotalMarks(students);
        System.out.println("\nTotal Marks: " + totalMarks);

        // Use the flatMap operator to get a list of all the marks of all students and print them
        System.out.println("\nAll Marks:");
        getAllMarks(students).forEach(mark -> System.out.print(mark + " "));

        // Use the orElse operator to get the first male student's name and print it. If there are no male students, print "No male students found."
        String firstMaleStudentName = getFirstMaleStudentName(students);
        System.out.println("\n\nFirst Male Student's Name: " + firstMaleStudentName);

        // Use the orElseThrow operator to get the name of the first student who has scored less than 40 marks. If all students have scored more than 40 marks, throw an exception with a custom message.
        String firstStudentWithLessThan40Marks = getFirstStudentWithLessThan40Marks(students);
        System.out.println("\nFirst Student with less than 40 marks: " + firstStudentWithLessThan40Marks);

        // use forEach operator to print the name and marks of each student
        System.out.println("\nStudent Details:");
        printStudentDetails(students);
    }
}
