package logic_handel;

import entity.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void inputInfo() {
        System.out.println("Số học sinh muốn nhập: ");
        int studentNumber;
        do {
            try {
                studentNumber = new Scanner(System.in).nextInt();
                if (studentNumber > 0) break;
                System.out.println("Số lượng nhập vào lớn hơn 0. Vui lòng Nhập lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
        for (int i = 0; i < studentNumber; i++) {
            Student student = new Student();
            student.inputInfo();
            students.add(student);


        }
        showInfo();
    }

    public void showInfo() {
        students.forEach(System.out::println);
    }

    public Student findById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id)
                return students.get(i);

        }
        return null;
    }
    public boolean isEmptyStudent() {
        return this.students.isEmpty();
    }
}
