package com.example.bookmanagement.model;

import com.example.bookmanagement.statics.ReaderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reader extends Person{
    private ReaderType readerType;

    public Reader(int id, String name, String address, String phone, ReaderType readerType) {
        super(id, name, address, phone);
        this.readerType = readerType;
    }

}
