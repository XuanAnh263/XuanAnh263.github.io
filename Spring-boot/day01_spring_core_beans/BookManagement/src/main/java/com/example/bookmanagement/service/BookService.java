package com.example.bookmanagement.service;

import com.example.bookmanagement.entity.Book;
import com.example.bookmanagement.model.BookModel;
import com.example.bookmanagement.statics.Specialized;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BookService {
    ObjectMapper objectMapper;
    List<Book> books = new ArrayList<>();
    private static int AUTO_ID = 10000;

    public List<BookModel> getAllBooks() {
        List<BookModel> result = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            //convert từ entity --> model
            BookModel bookModel = objectMapper.convertValue(book, BookModel.class);

            result.add(bookModel);
        }
        return result;
    }


    public void saveBook(BookModel bookModel) {
        //convert từ model --> entity
        Book book = objectMapper.convertValue(bookModel, Book.class);
        book.setId(AUTO_ID);
        books.add(book);
        AUTO_ID++;
    }

    public BookModel findById(String id) {
        Optional<Book> bookOptional = books
                .stream()
                .filter(book -> book.getId() == Integer.parseInt(id))
                .findFirst();
        if (!bookOptional.isPresent()) { //trên java8 thì dùng bookOptional.isEmpty()
            return null;
        }
        Book book = bookOptional.get();
        return objectMapper.convertValue(book, BookModel.class);
    }

    public void updateBook(BookModel bookModel) {
        books.forEach(book -> {
            if (book.getId() != bookModel.getId()) return;
        book.setTitle(bookModel.getTitle());
        book.setAuthor(bookModel.getAuthor());
        book.setSpecialized(bookModel.getSpecialized());
        book.setPublishDate(bookModel.getPublishDate());
        });
    }

    public void delete(String id) {
        books.removeIf(book -> book.getId() == Integer.parseInt(id));
    }
}
