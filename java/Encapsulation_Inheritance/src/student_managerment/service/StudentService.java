package student_managerment.service;

import student_managerment.model.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentService {
    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();

        int id = rd.nextInt(100) + 1;
        System.out.println("Name : ");
        String name = scanner.nextLine();
        System.out.println("TheoryPoint : ");
        double thepryPoint = Double.parseDouble(scanner.nextLine());
        System.out.println("PracticePoint : ");
        double practicePoint = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, thepryPoint, practicePoint);
        return student;
    }

    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        return (theoryPoint + practicePoint) / 2;

    }

    public void printInfo(Student s) {
        //sử dụng biến tham chiếu
        System.out.println("id : " + s.id);
        System.out.println("name : " + s.name);
        System.out.println("theoryPoint : " + s.theoryPoint);
        System.out.println("practicePoint : " + s.practicePoint);
        System.out.println("avgPoint : " + calculateAvgPoint(s.theoryPoint, s.practicePoint));
    }
}
