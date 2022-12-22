package org.example.book_management.back_end.repository;

import org.example.book_management.back_end.database.BookDB;
import org.example.book_management.back_end.model.Book;

import java.util.List;

public class BookRepository {
    public static List<Book> findAll() {
        return BookDB.books;
    }
}
