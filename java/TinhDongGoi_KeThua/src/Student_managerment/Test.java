package Student_managerment;

import Student_managerment.model.Student;
import Student_managerment.service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        //muốn có đối tượng sinh viên dùng biến student để hứng dữ liệu
        Student student = studentService.createStudent();
        studentService.printInfo(student); // //truyền dữ liệu

        //Nhập nhiều đối tượng (phải biết có bao nhiêu đối tượng)
        //VD: có 3 đối tượng
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = studentService.createStudent();
        }
        //sử dụng for để in
        for (Student value : students) {
            studentService.printInfo(value);
        }
    }
}
