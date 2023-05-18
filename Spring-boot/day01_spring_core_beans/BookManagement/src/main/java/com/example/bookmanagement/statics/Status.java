package com.example.bookmanagement.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@AllArgsConstructor
public enum Status {
    NEW("new"),
    LIKE_NEW("Like new"),
    VERY_GOOD("Very good"),
    GOOD("Good"),
    ACCEPTABLE("Acceptable");

    String name;
}
