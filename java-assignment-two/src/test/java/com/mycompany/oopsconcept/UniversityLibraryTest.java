package com.mycompany.oopsconcept;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class UniversityLibraryTest   {

    private UniversityLibrary library;
    private Book book1;
    private Book book2;
    private Student student1;
    private Student student2;

    @BeforeTest
    public void setUp() {
        library = new UniversityLibrary();
        book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        student1 = new Student("John Doe", "1234");
        student2 = new Student("Jane Doe", "5678");
        library.addBook(book1);
        library.addBook(book2);
        library.addStudent(student1);
        library.addStudent(student2);
    }

    @Test
    public void testIssueBook() {
        library.issueBook(book1, student1);
        Assert.assertEquals(book1.getStatus(), BookStatus.ISSUED);
        Assert.assertEquals(student1.getBooksIssued().size(), 1);
        Assert.assertEquals(student1.getBooksIssued().get(0), book1);
    }

    @Test
    public void testReturnBook() {
        library.issueBook(book1, student1);
        library.returnBook(book1, student1);
        Assert.assertEquals(book1.getStatus(), BookStatus.RETURNED);
        Assert.assertEquals(student1.getBooksIssued().size(), 0);
    }

    @Test
    public void testAddBook() {
        Book newBook = new Book("The Catcher in the Rye", "J.D. Salinger");
        library.addBook(newBook);
        Assert.assertTrue(library.getAllBooks().contains(newBook));
    }

    @Test
    public void testRemoveBook() {
        library.removeBook(book1);
        Assert.assertFalse(library.getAllBooks().contains(book1));
    }

    @Test
    public void testAddStudent() {
        Student newStudent = new Student("Jack Smith", "9012");
        library.addStudent(newStudent);
        Assert.assertTrue(library.getAllStudents().contains(newStudent));
    }

    @Test
    public void testRemoveStudent() {
        library.removeStudent(student1);
        Assert.assertFalse(library.getAllStudents().contains(student1));
    }
}
