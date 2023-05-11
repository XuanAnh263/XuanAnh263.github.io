package com.example.thymeleaf01.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher {
    int id;
    String name;
    String phone;
    LocalDate dob;
    String gender;
    String specialized;
    String level;
}
