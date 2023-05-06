package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;

@Data
@AllArgsConstructor
public class Student extends Person{
    private int id;
    private String classes;

    private static int AUTO_ID = 10000;
    public Student() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public void inputInfo() {
        super.inputInfo();

        System.out.println("Nhập lớp: ");
        this.setClasses(new Scanner(System.in).nextLine());
    }
}
