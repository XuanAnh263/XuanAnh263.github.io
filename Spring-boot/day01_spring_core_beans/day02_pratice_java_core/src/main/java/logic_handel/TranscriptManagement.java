package logic_handel;

import entity.Student;
import entity.Subject;
import entity.Transcript;
import entity.TranscriptDetail;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TranscriptManagement {
    private List<Transcript> transcripts;
    private StudentManagement studentManagement;
    private SubjectManagement subjectManagement;

    public TranscriptManagement(StudentManagement studentManagement, SubjectManagement subjectManagement) {
        this.transcripts = new ArrayList<>();
        this.studentManagement = studentManagement;
        this.subjectManagement = subjectManagement;
    }

    public void logTranscript() {
        if (studentManagement.isEmptyStudent() || subjectManagement.isEmptySubject()) {
            System.out.println("Cần nhập danh sách sinh viên và môn học trước khi thực hiện chức năng");
            return;
        }
        System.out.println("Số lượng sinh viên bạn muốn lập bảng điểm");
        int studentNumber;
        do {
            try {
                studentNumber = new Scanner(System.in).nextInt();
                if (studentNumber > 0) break;
                System.out.println("Số lượng nhập vào phải lớn hơn 0. Nhập lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Nhập ID của sinh viên thứ " + (i + 1) + " mà bạn muốn lập bảng điểm: ");
            int studentId;
            Student student;
            do {
                try {
                    studentId = new Scanner(System.in).nextInt();
                    student = studentManagement.findById(studentId);
                    if (student != null) break;
                    System.out.println("ID không tồn tại trong hệ thống. Vui lòng nhập lại: ");
                } catch (InputMismatchException ex) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            System.out.println("Sinh viên này học bao nhiêu môn:");
            int subjectNumber;
            do {
                try {
                    subjectNumber = new Scanner(System.in).nextInt();
                    if (subjectNumber > 0 ) break;
                    System.out.println("Số lượng môn học nhập vào phải lớn hơn 0, nhập lại: ");
                } catch (InputMismatchException ex) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            List<TranscriptDetail> transcriptDetails = new ArrayList<>();
            for (int j = 0; j < subjectNumber; j++) {
                System.out.println("Nhập mã môn học thứ " + (j + 1) + " mà sinh viên này học: ");
                int subjectId;
                Subject subject;
                do {
                    try {
                        subjectId = new Scanner(System.in).nextInt();
                        subject = subjectManagement.findById(subjectId);
                        if (subject != null) break;
                        System.out.println("ID không tồn tại trong hệ thống, vui lòng nhập lại: ");
                    } catch (InputMismatchException ex) {
                        System.out.println("Vui lòng nhập số");
                    }
                } while (true);

                System.out.println("Số điểm  sinh viên này đạt cho môn học vừa nhập là bao nhiêu: ");
                float score;
                do {
                    try {
                        score = new Scanner(System.in).nextFloat();
                        if (score >= 0 && score <= 10) break;
                        System.out.println("Số số điểm nhập vào từ 0 tới 10, nhập lại");
                    } catch (InputMismatchException ex) {
                        System.out.println("Vui lòng nhập số");
                    }
                } while (true);

                TranscriptDetail transcriptDetail = new TranscriptDetail(subject, score);
                transcriptDetails.add(transcriptDetail);
            }
            Transcript transcript = new Transcript(student, transcriptDetails);
            transcripts.add(transcript);
        }
        showInfo();

    }

    public void sortMenu() {
        System.out.println("---------SẮP XẾP DANH SÁCH BẢNG ĐIỂM---------");
        System.out.println("1. Sắp xếp theo họ tên sinh viên");
        System.out.println("2. Sắp xếp theo tên môn học");
        System.out.println("3. Quay lại");
        int choice ;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 && choice <=3) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số từ 1 tới 3");
            }
        } while (true);
        switch (choice) {
            case 1:
                sortByStudentName();
                showInfo();
                break;
            case 2:
                sortBySubjectName();
                showInfo();
                break;
            case 3:
                return;
        }
    }

    private void sortBySubjectName() {
        this.transcripts.forEach(transcript -> {
            transcript.getTranscriptDetails().sort((t1, t2) ->
                    t1.getSubject().getName().compareToIgnoreCase(t2.getSubject().getName()));
        });
    }

    private void sortByStudentName() {
        this.transcripts.sort((student1, student2) ->
                student1.getStudent().getName().compareToIgnoreCase(student2.getStudent().getName()));
    }

    public void showInfo() {
        transcripts.forEach(System.out::println);
    }
    public void overAllMark() {
        //TODO-------
        if (this.transcripts.isEmpty()) {
            System.out.println("Cần thực hiện nhập điểm cho sinh viên trước khi tổng kết điểm");
            return;
        }
        transcripts.forEach(student -> {
            float score = 0;
            List<TranscriptDetail> transcriptDetails =  student.getTranscriptDetails();
            for (int i = 0; i < transcriptDetails.size(); i++) {
                TranscriptDetail transcriptDetail =  transcriptDetails.get(i);
                //Công thức tính điểm ???
//                float tempScore =  ;
//                score += tempScore;
            }
        });
    }


}
