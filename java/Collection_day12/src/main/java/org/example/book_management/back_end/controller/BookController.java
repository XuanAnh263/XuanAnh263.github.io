package org.example.book_management.back_end.controller;

import org.example.book_management.back_end.model.Book;
import org.example.book_management.back_end.service.BookService;

import java.util.List;

public class BookController {
    private static final BookService bookService = new BookService();
    public static List<Book> getBooks() {
        return bookService.getBooks();
    }

    public static List<Book> getBooksByName(String name) {
        return bookService.getBooksByName(name);

    }
}
