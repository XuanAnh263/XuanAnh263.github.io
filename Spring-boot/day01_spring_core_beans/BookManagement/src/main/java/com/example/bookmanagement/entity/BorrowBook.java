package com.example.bookmanagement.entity;

import com.example.bookmanagement.statics.Status;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BorrowBook {
    int id;
    Reader reader;
    Book book;
    int quantity;
    Status status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
}
