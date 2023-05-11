package com.example.thymeleaf01.controller;

import com.example.thymeleaf01.model.Student;
import com.example.thymeleaf01.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {

    StudentService studentService;

//    @RequestMapping
    @GetMapping
    public String getStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("danhSachSinhVien", students);
        return "student-list";
    }

    @GetMapping("/create-form")
    public String forwardToCreatFrom(Model model, Student student){

        model.addAttribute("themSinhVien", student);
        return "create-student";
    }

    @PostMapping
    public String creatNewStudent(@ModelAttribute("student") Student student) {

        studentService.saveStudent(student);
        return "redirect:/students";
    }



}
