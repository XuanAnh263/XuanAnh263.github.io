package com.example.transportation_management.entity;

import com.example.transportation_management.statics.DriverLevel;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Driver extends Person{
    DriverLevel driverLevel;

    public Driver(int id, String name, String address, String phone, DriverLevel driverLevel) {
        super(id, name, address, phone);
        this.driverLevel = driverLevel;
    }
}
