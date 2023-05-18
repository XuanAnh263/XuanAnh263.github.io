package com.example.bookmanagement.model;

import com.example.bookmanagement.statics.Specialized;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookModel {
    int id;

    @Size(max = 255, message = "Title cannot over 255 characters")
    @NotBlank(message = "Book Title cannot be blank")
    String title;

    @Size(max = 255, message = "Author cannot over 255 characters")
    @NotBlank(message = "Book author cannot be blank")
    String author;


    Specialized specialized;

    @Min(value = 1900, message = "Publish Date cannot be less than 1900")
    @Max(value = 2023, message = "Publish Date cannot be greater than 10")
//    @Past(message = "Publish date should be less than current date!!")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    int publishDate;

}
