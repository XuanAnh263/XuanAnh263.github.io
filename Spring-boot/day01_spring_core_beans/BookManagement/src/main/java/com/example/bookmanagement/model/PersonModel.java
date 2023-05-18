package com.example.bookmanagement.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
public class PersonModel {
    int id;

    @Size(max = 100, message = "Name cannot over 100 characters")
    @NotBlank(message = "Student name cannot be blank")
    String name;

    @Size(max = 255, message = "Address cannot over 255 characters")
    @NotBlank(message = "Student address cannot be blank")
    String address;

    @NotBlank(message = "Student phone cannot be blank")
    @Pattern(regexp = "\\d{10}", message = "Phone must be 10 number characters")
    String phone;
}
