package com.example.bookmanagement.entity;

import com.example.bookmanagement.statics.Specialized;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    int id;
    String title;
    String author;
    Specialized specialized;
    int publishDate;

}
