package com.example.transportation_management.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RouteModel {
    int id;

    @NotNull(message = "Distance cannot be blank")
    @Range(min = 1, message = "Distance must be greater than 0")
    float distance;

    @NotNull(message = "Stop Point cannot be blank")
    @Range(min = 1, message = "Stop Point must be greater than 0")
    int stopPoint;
}
