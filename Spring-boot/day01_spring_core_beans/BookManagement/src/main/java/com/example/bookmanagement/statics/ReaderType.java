package com.example.bookmanagement.statics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ReaderType {
    STUDENT("Student"), POST_GRADUATE("Post Graduate"), TEACHER("Teacher");
    String name;
}
