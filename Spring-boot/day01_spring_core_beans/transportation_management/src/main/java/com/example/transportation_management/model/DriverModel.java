package com.example.transportation_management.model;

import com.example.transportation_management.statics.DriverLevel;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverModel extends PersonModel {
    DriverLevel driverLevel;
}
