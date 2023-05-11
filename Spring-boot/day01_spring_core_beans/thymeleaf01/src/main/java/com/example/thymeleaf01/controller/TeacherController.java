package com.example.thymeleaf01.controller;


import com.example.thymeleaf01.model.Student;
import com.example.thymeleaf01.model.Teacher;
import com.example.thymeleaf01.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;
@Controller
@AllArgsConstructor
@RequestMapping("/teachers")
public class TeacherController {

    TeacherService teacherService;
    @RequestMapping
    public String getTeachers(Model model) {
        List<Teacher> teachers = teacherService.getAllTeachers();
        model.addAttribute("danhSachGiangVien", teachers);
        return "teacher-list";
    }

    @GetMapping("/teacher-form")
    public String forwardToCreatForm(Model model, Teacher teacher) {
        model.addAttribute("themGiangVien", teacher);
        return "create-teacher";
    }

    @PostMapping
    public String createNewTeacher(@ModelAttribute("teacher") Teacher teacher){
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }
}
