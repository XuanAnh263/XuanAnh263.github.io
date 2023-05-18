package com.example.bookmanagement.model;

import com.example.bookmanagement.entity.Book;
import com.example.bookmanagement.entity.Reader;
import com.example.bookmanagement.statics.Status;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BorrowBookModel {
    int id;
    Reader reader;
    Book book;

    @NotNull(message = "Số lượng mượn không được trống!")
    @Range(min = 1, max = 3, message = "Số lượng trong khoảng từ 1 đến 3")
    int quantity;
    Status status;

    @NotNull(message = "Ngày mượn không được trống!")
    @PastOrPresent(message = "Ngày mượn phải trước bằng ngày hôm nay!")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
}
