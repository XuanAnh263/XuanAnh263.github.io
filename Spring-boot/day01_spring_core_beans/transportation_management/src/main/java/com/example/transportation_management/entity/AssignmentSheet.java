package com.example.transportation_management.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AssignmentSheet {
    int id;
    Driver driver;
    Route route;
    int numberOfTurns;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;
}
