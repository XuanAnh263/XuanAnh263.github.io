package TinhDongGoi;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("1", -1, 15, "nbgh");
        student.showInfo(); // thông qua showInfo để hiển thị thông tin của sinh viên
        student.calculateScholarship(); //thông qua calculateScholarship để kiểm tra có nhận học bổng hay không

        Student student1 = new Student("ab123456", 8, 22, "A234");
        student1.showInfo();
        student1.calculateScholarship();
    }
}
