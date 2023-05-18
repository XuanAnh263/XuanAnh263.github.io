package com.example.bookmanagement.service;


import com.example.bookmanagement.entity.Reader;
import com.example.bookmanagement.model.ReaderModel;
import com.example.bookmanagement.statics.ReaderType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReaderService {
    ObjectMapper objectMapper;
    List<Reader> readers = new ArrayList<>();
    private static int AUTO_ID = 10000;

    public List<ReaderModel> getAllReaders() {
        List<ReaderModel> result = new ArrayList<>();
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);

            //convert từ entity --> model
            ReaderModel readerModel = objectMapper.convertValue(reader, ReaderModel.class);

            result.add(readerModel);
        }
        return result;
    }


    public void saveReader(ReaderModel readerModel) {
        //convert từ model --> entity
        Reader reader = objectMapper.convertValue(readerModel, Reader.class);
        reader.setId(AUTO_ID);
        readers.add(reader);
        AUTO_ID++;
    }

    public ReaderModel findById(String id) {
        Optional<Reader> readerOptional = readers
                .stream()
                .filter(reader -> reader.getId() == Integer.parseInt(id))
                .findFirst();
        if (!readerOptional.isPresent()) { //trên java8 thì dùng bookOptional.isEmpty()
            return null;
        }
        Reader reader = readerOptional.get();
        return objectMapper.convertValue(reader, ReaderModel.class);
    }

    public void updateReader(ReaderModel readerModel) {
        readers.forEach(reader -> {
            if (reader.getId() != readerModel.getId()) return;
            reader.setName(readerModel.getName());
            reader.setAddress(readerModel.getAddress());
            reader.setPhone(readerModel.getPhone());
            reader.setReaderType(readerModel.getReaderType());
        });
    }

    public void delete(String id) {
        readers.removeIf(reader -> reader.getId() == Integer.parseInt(id));
    }


}
