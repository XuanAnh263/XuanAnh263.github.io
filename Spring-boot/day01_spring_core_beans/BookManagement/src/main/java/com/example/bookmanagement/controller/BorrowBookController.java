package com.example.bookmanagement.controller;

import com.example.bookmanagement.model.BorrowBook;
import com.example.bookmanagement.service.BorrowBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/borrows")
public class BorrowBookController {
    BorrowBookService borrowBookService;

    @GetMapping
    public String getAllBorrow(Model model) {
        List<BorrowBook> borrowBooks = borrowBookService.getAllBorrows();
        model.addAttribute("danhSachMuonBook", borrowBooks);
        return "borrow-book-list";
    }
}
