package com.example.bookmanagement.service;

import com.example.bookmanagement.model.Book;
import com.example.bookmanagement.model.BorrowBook;
import com.example.bookmanagement.model.BorrowBookDetail;
import com.example.bookmanagement.model.Reader;
import com.example.bookmanagement.statics.ReaderType;
import com.example.bookmanagement.statics.Specialized;
import com.example.bookmanagement.statics.Status;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowBookService {
    private static List<BorrowBook> borrowBooks = new ArrayList<>();
    private static int AUTO_ID = 1;

    static {
        Reader reader = new Reader(25, "Bùi Thị Minh", "Hà Nội", "098765434", ReaderType.TEACHER);

        Book book = new Book(1, "Hacker Ielts Listening", "Hường Phạm", Specialized.CNTT, 2021);
        BorrowBookDetail borrowBookDetail = new BorrowBookDetail(book, 2, Status.NEW);

        Book book2 = new Book(2, "OCA Java SE 8", "Kathy Sierra", Specialized.CNTT, 2015);
        BorrowBookDetail borrowBookDetail2 = new BorrowBookDetail(book2, 3, Status.NEW);

        borrowBooks.add(new BorrowBook(1, reader, borrowBookDetail, LocalDate.now()));
        borrowBooks.add(new BorrowBook(2, reader, borrowBookDetail2, LocalDate.now()));

    }

    public List<BorrowBook> getAllBorrows() {
        return borrowBooks;
    }

}
