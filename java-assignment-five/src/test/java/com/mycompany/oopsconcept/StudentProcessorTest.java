package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class StudentProcessorTest {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student("Alice", LocalDate.of(2000, 1, 1), "female", Arrays.asList(80, 85, 90)),
            new Student("Bob", LocalDate.of(2001, 2, 2), "male", Arrays.asList(70, 75, 80)),
            new Student("Charlie", LocalDate.of(2002, 3, 3), "male", Arrays.asList(60, 65, 70)),
            new Student("David", LocalDate.of(2003, 4, 4), "male", Arrays.asList(50, 55, 60)),
            new Student("Eve", LocalDate.of(2004, 5, 5), "female", Arrays.asList(40, 45, 50))
    );

    @Test
    public void testFilterByGender() {
        List<Student> femaleStudents = StudentProcessor.filterByGender(STUDENTS, "female");
        Assert.assertEquals(femaleStudents.size(), 2);
        Assert.assertTrue(femaleStudents.stream().allMatch(s -> s.getGender().equals("female")));

        List<Student> maleStudents = StudentProcessor.filterByGender(STUDENTS, "male");
        Assert.assertEquals(maleStudents.size(), 3);
        Assert.assertTrue(maleStudents.stream().allMatch(s -> s.getGender().equals("male")));
    }

    @Test
    public void testGetDateOfBirthOfMaleStudents() {
        List<LocalDate> dates = StudentProcessor.getDateOfBirthOfMaleStudents(STUDENTS);
        Assert.assertEquals(dates.size(), 3);
        Assert.assertTrue(dates.stream().allMatch(d -> d != null));
    }

    @Test
    public void testGetTotalMarks() {
        int totalMarks = StudentProcessor.getTotalMarks(STUDENTS);
        Assert.assertEquals(totalMarks, 1275);
    }

    @Test
    public void testGetAllMarks() {
        List<Integer> allMarks = StudentProcessor.getAllMarks(STUDENTS);
        Assert.assertEquals(allMarks.size(), 15);
        Assert.assertTrue(allMarks.stream().allMatch(m -> m >= 0 && m <= 100));
    }

    @Test
    public void testGetFirstMaleStudentName() {
        String name = StudentProcessor.getFirstMaleStudentName(STUDENTS);
        Assert.assertEquals(name, "Bob");
    }

    @Test
    public void testGetFirstStudentWithLessThan40Marks() {
        String name = StudentProcessor.getFirstStudentWithLessThan40Marks(STUDENTS);
        Assert.assertEquals(name, "Eve");
    }

    // Test printStudentDetails() by redirecting System.out to a string and verifying its contents
    @Test
    public void testPrintStudentDetails() {

        // Redirect console output to a string
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        StudentProcessor.printStudentDetails(STUDENTS);

        // Check the console output
        String expectedOutput = "Name: Alice Marks: [80, 85, 90]\r\n" +
                "Name: Bob Marks: [70, 75, 80]\r\n" +
                "Name: Charlie Marks: [60, 65, 70]\r\n" +
                "Name: David Marks: [50, 55, 60]\r\n" +
                "Name: Eve Marks: [40, 45, 50]\r\n";
        assertEquals(outputStream.toString(), expectedOutput);
    }
}

