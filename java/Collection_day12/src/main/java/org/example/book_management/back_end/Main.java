package org.example.book_management.back_end;

import org.example.book_management.back_end.database.BookDB;
import org.example.book_management.back_end.model.Book;
import org.example.book_management.front_end.ui.BookUI;

public class Main {
    public static void main(String[] args) {
        BookUI bookUI = new BookUI();
        bookUI.run();
    }
}
