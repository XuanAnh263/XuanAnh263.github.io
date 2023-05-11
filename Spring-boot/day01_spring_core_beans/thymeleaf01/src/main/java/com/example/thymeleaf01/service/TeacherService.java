package com.example.thymeleaf01.service;

import com.example.thymeleaf01.model.Teacher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    private static List<Teacher> teachers = new ArrayList<>();

    public void creatData() {
        for (int i = 0; i < 10; i++) {
            Teacher teacher = Teacher.builder()
                    .id(i)
                    .name("Bui Thi Huong " + i)
                    .phone("09928732" + i)
                    .dob(LocalDate.now())
                    .gender("nam/nu " + i )
                    .specialized("Ngành " + i)
                    .level(" bac " + i)
                    .build();
            teachers.add(teacher);
        }
    }

    public List<Teacher> getAllTeachers() {
        creatData();
        return teachers;
    }

    public void saveTeacher(Teacher teacher){
        teachers.add(teacher);
    }

}
