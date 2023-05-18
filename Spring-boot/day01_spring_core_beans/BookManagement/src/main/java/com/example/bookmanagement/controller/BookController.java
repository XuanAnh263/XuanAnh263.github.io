package com.example.bookmanagement.controller;

import com.example.bookmanagement.model.BookModel;
import com.example.bookmanagement.service.BookService;
import com.example.bookmanagement.statics.Specialized;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {
    BookService bookService;

    @GetMapping
    public String getBooks(Model model) {
        List<BookModel> bookModels = bookService.getAllBooks();
        model.addAttribute("bookList", bookModels);
        return "book-list";
    }

    @GetMapping("/create-form")
    public String forwardToCreateForm(Model model) {
        BookModel bookModel = new BookModel();
        List<Specialized> specializeds = new ArrayList<>(Arrays.asList(Specialized.values()));

        model.addAttribute("SpecializedList", specializeds);

        model.addAttribute("CreateBook", bookModel);
        return "create-book";
    }

    @PostMapping
    public String createNewBook(@ModelAttribute("CreateBook") @Valid BookModel bookModel, Errors errors, Model model) {
        //@valid là dữ liệu truyền vào từ class BookModel
        if (null != errors && errors.getErrorCount() >0) {
            List<Specialized> specializeds = new ArrayList<>(Arrays.asList(Specialized.values()));

            model.addAttribute("SpecializedList", specializeds);
            return "create-book";
        } else {
            bookService.saveBook(bookModel);
            return "redirect:/books";
        }
    }

    @GetMapping("/update/{id}")
    public String forwardUpdateForm(@PathVariable String id, Model model) {
        BookModel bookModel = bookService.findById(id);
        List<Specialized> specializeds = new ArrayList<>(Arrays.asList(Specialized.values()));

        model.addAttribute("SpecializedList", specializeds);
        model.addAttribute("BookEdit", bookModel);
        return "update-book";
    }

    @PostMapping("/update")
    public String updateBook(@ModelAttribute("BookEdit") @Valid BookModel bookModel, Errors errors) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "update-book";
        } else {
            bookService.updateBook(bookModel);
            return "redirect:/books";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        bookService.delete(id);
        return "redirect:/books";
    }
}
