package com.example.transportation_management.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DriverLevel {
    LEVEL_1(" Hạng A"),
    LEVEL_2(" Hạng B"),
    LEVEL_3(" Hạng C"),
    LEVEL_4(" Hạng D"),
    LEVEL_5(" Hạng E"),
    LEVEL_6(" Hạng F");

    String name;
}
