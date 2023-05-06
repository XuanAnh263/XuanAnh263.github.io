package logic_handel;

import entity.Subject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SubjectManagement {
    private List<Subject> subjects;
    public SubjectManagement() {
        this.subjects = new ArrayList<>();
    }

    public void inputInfo() {
        System.out.println("Số môn học muốn nhập: ");
        int subjectNumber;
        do {
            try {
                subjectNumber = new Scanner(System.in).nextInt();
                if (subjectNumber > 0) break;
                System.out.println("Số lượng nhập vào phải lớn hơn 0. Vui lòng nhập lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
        for (int i = 0; i < subjectNumber; i++) {
            Subject subject = new Subject();
            subject.inputInfo();
            subjects.add(subject);
        }
        showInfo();
    }

    private void showInfo() {
        subjects.forEach(System.out::println);
    }
    public Subject findById(int id) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getId() == id)
                return subjects.get(i);

        }
        return null;
    }
    public boolean isEmptySubject() {
        return this.subjects.isEmpty();
    }
}
