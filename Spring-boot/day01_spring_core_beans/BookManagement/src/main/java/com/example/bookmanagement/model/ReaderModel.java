package com.example.bookmanagement.model;

import com.example.bookmanagement.statics.ReaderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReaderModel extends PersonModel {
    private ReaderType readerType;

    public ReaderModel(int id, String name, String address, String phone, ReaderType readerType) {
        super(id, name, address, phone);
        this.readerType = readerType;
    }

}
