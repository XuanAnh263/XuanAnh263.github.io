package org.example.book_management.back_end.database;

import org.example.book_management.back_end.model.Book;
import org.example.book_management.back_end.utils.FileUtils;

import java.util.List;

public class BookDB {
    public static List<Book> books = FileUtils.getDataFromFile("book.json");
}
