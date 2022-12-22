package org.example.book_management.back_end.service;

import org.example.book_management.back_end.model.Book;
import org.example.book_management.back_end.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final BookRepository bookRepository = new BookRepository();

    public List<Book> getBooks() {
        return BookRepository.findAll();
    }

    public List<Book> getBooksByName(String name) {
        List<Book> books = BookRepository.findAll();
        List<Book> rs = new ArrayList<>();

        for (Book book: books) {
            if (book.getTitle().toLowerCase().contains(name.toLowerCase())) {
                rs.add(book);
            }
        }
        return rs;
    }
}
