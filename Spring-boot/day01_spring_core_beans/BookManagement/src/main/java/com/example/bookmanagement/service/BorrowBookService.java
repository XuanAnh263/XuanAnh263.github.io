package com.example.bookmanagement.service;

import com.example.bookmanagement.entity.BorrowBook;
import com.example.bookmanagement.model.BorrowBookModel;
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
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class BorrowBookService {
    ObjectMapper objectMapper;
    List<BorrowBook> borrowBooks = new ArrayList<>();
    private static int AUTO_ID = 1;

//    static {
//        ReaderModel reader = new ReaderModel(25, "Bùi Thị Minh", "Hà Nội", "098765434", ReaderType.TEACHER);
//
//        BookModel book = new BookModel(1, "Hacker Ielts Listening", "Hường Phạm", Specialized.CNTT, 2021);
//        BorrowBookDetail borrowBookDetail = new BorrowBookDetail(book, 2, Status.NEW);
//
//        BookModel book2 = new BookModel(2, "OCA Java SE 8", "Kathy Sierra", Specialized.CNTT, 2015);
//        BorrowBookDetail borrowBookDetail2 = new BorrowBookDetail(book2, 3, Status.NEW);
//
//        borrowBooks.add(new BorrowBookModel(1, reader, borrowBookDetail, LocalDate.now()));
//        borrowBooks.add(new BorrowBookModel(2, reader, borrowBookDetail2, LocalDate.now()));
//
//    }

    public List<BorrowBookModel> getAllBorrows() {
        List<BorrowBookModel> result = new ArrayList<>();
        for (int i = 0; i < borrowBooks.size(); i++) {
            BorrowBook borrowBook = borrowBooks.get(i);

            BorrowBookModel borrowBookModel = objectMapper.convertValue(borrowBook, BorrowBookModel.class);
            result.add(borrowBookModel);
        }
        return  result;
    }

    public void  saveBorrow(BorrowBookModel borrowBookModel) {
        BorrowBook borrowBook = objectMapper.convertValue(borrowBookModel, BorrowBook.class);
        borrowBook.setId(AUTO_ID);
        borrowBooks.add(borrowBook);
        AUTO_ID++;
    }

    public BorrowBookModel findById(String id) {
        Optional<BorrowBook> borrowBookOptional = borrowBooks
                .stream()
                .filter(borrowBook -> borrowBook.getId() == Integer.parseInt(id))
                .findFirst();
        if (!borrowBookOptional.isPresent()) return null;
        BorrowBook borrowBook = borrowBookOptional.get();
        return objectMapper.convertValue(borrowBook, BorrowBookModel.class);
    }
}
