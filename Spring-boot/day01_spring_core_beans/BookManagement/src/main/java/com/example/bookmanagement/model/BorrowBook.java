package com.example.bookmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BorrowBook {
    private int id;
    private Reader reader;
    private BorrowBookDetail borrowBookDetail;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
}
