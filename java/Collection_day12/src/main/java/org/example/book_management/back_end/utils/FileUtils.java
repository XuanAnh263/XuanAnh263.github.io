package org.example.book_management.back_end.utils;

import com.google.gson.Gson;
import org.example.book_management.back_end.model.Book;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
    public static List<Book> getDataFromFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            //Todo: đang có vấn đề ở đây - lỗi khi file trống
            List<Book> books = Arrays.asList(gson.fromJson(reader, Book[].class));
            reader.close();
            return books;
        } catch (IOException e) {
//            e.printStackTrace();
        }
//        return null;
        return new ArrayList<>();
    }

    public static void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            Gson gson = new Gson();
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));
            gson.toJson(obj, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
