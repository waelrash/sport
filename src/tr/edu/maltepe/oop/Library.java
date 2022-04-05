package tr.edu.maltepe.oop;

import java.util.*;

public class Library {

    java.util.ArrayList<Book> books;


    public Library() {

        books = new java.util.ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void lendBookToProf(Prof prof, Book book){
        books.remove(book);
        prof.addBook(book);
    }

    public void lendBookToStud(Student student, Book book){
        books.remove(book);
        student.addBook(book);
    }

    public void printAvailableBooks() {
        boolean bookPresent = false;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                bookPresent = true;
            }
        }

        if (!bookPresent) {
            System.out.println("No book in catalog");
        }
    }
}