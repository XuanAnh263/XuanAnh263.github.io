package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import statics.SubjectLevel;

import java.util.InputMismatchException;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Subject {
    private int id;
    private String name;
    private int teachingUnit;
    private SubjectLevel level;
    private static int AUTO_ID = 100;
    public Subject() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public void inputInfo() {
        System.out.println("Nhập tên: ");
        this.setName(new Scanner(System.in).nextLine());

        System.out.println("Nhập đơn vị học trình: ");
        this.setTeachingUnit(new Scanner(System.in).nextInt());

        System.out.println("Nhập loại môn: ");
        System.out.println("1. Đại Cương");
        System.out.println("2. Cơ Sở Ngành");
        System.out.println("3. Chuyên Ngành");

        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >=1 && choice <= 3) break;
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số từ 1 tới 3");
            }
        }while (true);
        switch (choice) {
            case 1:
                this.setLevel(SubjectLevel.dai_cuong);
                break;
            case 2:
                this.setLevel(SubjectLevel.co_so_nganh);
                break;
            case 3:
                this.setLevel(SubjectLevel.chuyen_nganh);
                return;
        }
    }
}
