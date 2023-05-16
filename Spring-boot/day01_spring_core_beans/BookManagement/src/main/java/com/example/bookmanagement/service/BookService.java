package com.example.bookmanagement.service;

import com.example.bookmanagement.model.Book;
import com.example.bookmanagement.statics.Specialized;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static final List<Book> books = new ArrayList<>();
    private static int AUTO_ID = 10000;

    static {
        for (int i = 0; i < 5; i++) {
            Book book = Book.builder()
                    .id(i + 10000)
                    .title("JAva Spring Boot " + i + 1)
                    .author("Anh " + i)
                    .specialized(Specialized.CNTT)
                    .publishDate(2015 + i + 1)
                    .build();
            books.add(book);
        }
    }

    public List<Book> getAllBooks() {
        return books;
    }


    public void createNewBook(Book book) {
        book.setId(AUTO_ID);
        AUTO_ID++;
        books.add(book);
    }

    public Book getBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public void updateBook(Book book) {
        Book bookUpdate = getBookById(book.getId());
        bookUpdate.setTitle(book.getTitle());
        bookUpdate.setAuthor(book.getAuthor());
        bookUpdate.setSpecialized(book.getSpecialized());
        bookUpdate.setPublishDate(book.getPublishDate());
    }

    public void deleteBook(int id) {
        books.removeIf(b -> b.getId() == id);
    }
}
