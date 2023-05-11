package com.example.thymeleaf01.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Scanner;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    int id;
    String name;
    String address;
    String phone;
    LocalDate dob;
    float gpa;


}
