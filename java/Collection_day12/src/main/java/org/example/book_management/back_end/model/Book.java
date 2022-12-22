package org.example.book_management.back_end.model;


import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//B1.
public class Book {
    private int id;
    private String title;

    @SerializedName("category")
    private List<String> categories; //với category là một mảng String

    private String author;

    @SerializedName("page_number")
    private int pageNumber;

    @SerializedName("release_year")
    private int releaseYear;
}
