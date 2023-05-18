package com.example.bookmanagement.controller;

import com.example.bookmanagement.entity.Book;
import com.example.bookmanagement.model.BookModel;
import com.example.bookmanagement.model.BorrowBookModel;
import com.example.bookmanagement.model.ReaderModel;
import com.example.bookmanagement.service.BookService;
import com.example.bookmanagement.service.BorrowBookService;
import com.example.bookmanagement.service.ReaderService;
import com.example.bookmanagement.statics.Status;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/borrows")
public class BorrowBookController {
    BorrowBookService borrowBookService;
    BookService bookService;
    ReaderService readerService;

    @GetMapping
    public String getAllBorrow(Model model) {
        List<BorrowBookModel> borrowBooks = borrowBookService.getAllBorrows();
        model.addAttribute("BorrowList", borrowBooks);
        return "borrow-book-list";
    }

    @GetMapping("/create-form")
    public String forwardCreateBorrowForm(Model model) {
        BorrowBookModel borrowBookModel = new BorrowBookModel();
        getBooks(model);

        model.addAttribute("CreateBorrow", borrowBookModel);
        return "create-borrow-book-list";
    }

    @PostMapping
    public String createNewBorrowBook(@ModelAttribute("CreateBorrow") @Valid BorrowBookModel borrowBookModel, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            getBooks(model);
            return "create-borrow-book-list";
        } else {
            borrowBookService.saveBorrow(borrowBookModel);
            return "redirect:/borrows";
        }
//        borrowBookService.saveBorrow(borrowBookModel);
//        return "redirect:/borrows";
    }

    private void getBooks(Model model) {
        List<BookModel> bookModels = bookService.getAllBooks();
        List<ReaderModel> readerModels = readerService.getAllReaders();
        List<Status> statuses = new ArrayList<>(Arrays.asList(Status.values()));

        model.addAttribute("BookList", bookModels);
        model.addAttribute("ReaderList", readerModels);
        model.addAttribute("StatusList", statuses);
    }
}
