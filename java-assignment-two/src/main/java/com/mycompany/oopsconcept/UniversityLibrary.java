package com.mycompany.oopsconcept;

import java.util.ArrayList;
import java.util.List;

enum BookStatus {
    AVAILABLE,
    ISSUED,
    RETURNED
}

class Book {
    private int bookId;
    private String bookTitle;
    private String author;
    private String publicationDate;
    private BookStatus bookStatus;

    public Book(int bookId, String bookTitle, String author, String publicationDate) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationDate = publicationDate;
        this.bookStatus = BookStatus.AVAILABLE;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}

class Student {
    private int studentId;
    private String name;
    private String email;
    private String contactNumber;

    public Student(int studentId, String name, String email, String contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}

interface Library {
    void addBook(Book book);
    void issueBook(Book book, Student student);
    void returnBook(Book book);
    void displayAllBooks();
}

public class UniversityLibrary implements Library {
    private List<Book> books;

    public UniversityLibrary() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void issueBook(Book book, Student student) {
        if (book.getBookStatus() == BookStatus.AVAILABLE) {
            book.setBookStatus(BookStatus.ISSUED);
            System.out.println("Book " + book.getBookTitle() + " issued to student " + student.getName());
        } else {
            System.out.println("Book " + book.getBookTitle() + " is not available");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (book.getBookStatus() == BookStatus.ISSUED) {
            book.setBookStatus(BookStatus.RETURNED);
            System.out.println("Book " + book.getBookTitle() + " returned");
        } else {
            System.out.println("Book " + book.getBookTitle() + " was not issued to any student");
        }
    }

    @Override
    public void displayAllBooks() {
        System.out.println("All books in the library:");
        for (Book book : books) {
            System.out.println(book.getBookId() + " " + book.getBookTitle() + " " + book.getAuthor() + " " + book.getPublicationDate() + " " + book.getBookStatus());
        }
    }
}
