package logic_handel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManagement {
    private StudentManagement studentManagement;
    private SubjectManagement subjectManagement;
    private TranscriptManagement transcriptManagement;

    public MenuManagement() {
        this.studentManagement = new StudentManagement();
        this.subjectManagement = new SubjectManagement();
        this.transcriptManagement = new TranscriptManagement(studentManagement, subjectManagement);
    }

    public void menu() {
        while (true) {
            printMenu();
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1: {
                    studentManagement.inputInfo();
                    break;}
                case 2:{
                    subjectManagement.inputInfo();
                    break;}
                case 3:
                    transcriptManagement.logTranscript();
                    break;
                case 4:
                    transcriptManagement.sortMenu();
                    break;
                case 5:
//
                    break;
                case 6:
                    return;

            }
        }

    }



    private void printMenu() {
        System.out.println("---------PHẦN MỀM QUẢN LÝ HỌC SINH---------");
        System.out.println("1.Nhập danh sách sinh viên mới. In ra danh sách sinh viên đã có ");
        System.out.println("2. Nhập danh sách môn học mới. In ra danh sách môn học đã có");
        System.out.println("3. Nhập điểm cho sinh viên. In ra màn danh sách điểm");
        System.out.println("4. Sắp xếp danh sách bảng điểm");
        System.out.println("5. Tính điểm tổng kết cho sinh viên");
        System.out.println("6. Thoát");
        System.out.println("Vui lòng chọn chức năng: ");
    }
    private int functionChoice() {
        int choice ;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <=6) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số từ 1 tới 6");
            }
        } while (true);
        return  choice;
    }
}
