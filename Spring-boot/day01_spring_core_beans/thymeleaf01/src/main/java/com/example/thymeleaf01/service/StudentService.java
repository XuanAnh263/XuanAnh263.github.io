package com.example.thymeleaf01.service;

import com.example.thymeleaf01.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private  List<Student> students;

    public StudentService(List<Student> students) {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }
    public void creatData() {
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .id(i)
                    .name("Nguyen van " + i)
                    .address("Ha noi " + i)
                    .phone("09928732" + i)
                    .dob(LocalDate.now())
                    .gpa(i)
                    .build();
            students.add(student);
        }
    }
//   static  {
//        for (int i = 0; i < 10; i++) {
//            Student student = Student.builder()
//                    .id(i)
//                    .name("Nguyen van " + i)
//                    .address("Ha noi " + i)
//                    .phone("09928732" + i)
//                    .dob(LocalDate.now())
//                    .gpa(i)
//                    .build();
//            students.add(student);
//        }
//    }
    public List<Student> getAllStudents() {
        creatData();
        return students;
    }




    public void saveStudent(Student student) {
        students.add(student);
    }

}
