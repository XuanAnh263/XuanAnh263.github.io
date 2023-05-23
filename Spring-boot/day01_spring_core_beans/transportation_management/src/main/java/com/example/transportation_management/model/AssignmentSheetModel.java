package com.example.transportation_management.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AssignmentSheetModel {
    int id;


    Integer driverId;
    String driverName;

    Integer routeId;

    @NotNull(message = "Number Of Turns cannot be blank")
//    @Min(value = 1, message = "Number Of Turns must be greater than 1")
//    @Max(value = 15, message = "Number Of Turns must be less than 15")
    @Range(min = 1, max = 15, message = "Number of turns form 1 to 15")
    int numberOfTurns;

    @NotNull(message = "Date cannot be blank")
    @PastOrPresent(message = "Date should be less than current date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;

}
