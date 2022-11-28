import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);

        //nhập tên
        System.out.println("nhập tên : ");
        String name = sc.nextLine();

        System.out.println("nhập địa chỉ : ");
        String address = sc.nextLine();

        System.out.println("nhập tuổi : ");
        //cách 1: khắc phục lỗi trôi lệnh
        //int age = Integer.parseInt(sc.nextLine());

        // cách 2:khắc phục lỗi trôi lệnh
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("nhập email : ");
        String email = sc.nextLine();

        //Println: tự động xuống dòng
        System.out.println(
                "tên tôi là : " + name
                + ". Địa chỉ là : " + address
                + ". Năm nay tôi : " + age + "tuổi"
                + ". Email của tôi là : " + email
        );


        // Print: ko tự độgn xuống dòng
        System.out.print("Tên : " + name);
        System.out.print("Tuổi : " + age);
        System.out.print("Email : " + email);
        System.out.print("Địa chỉ : " + address);

        // nếu muốn xuống dòng thì dùng ký tự \n
        System.out.print("Tên : " + name + "\n");
        System.out.print("Tuổi : " + age + "\n");
        System.out.print("Email : " + email + "\n");
        System.out.print("Địa chỉ : " + address + "\n");

        //Printf : in theo định dạng

        System.out.printf("Tên : %s\n", name);
        System.out.printf("Tuổi : %d\n", age); // số thì là %d
        System.out.printf("Địa chỉ : %s\n", address);
        System.out.printf("email : %s\n", email);

        System.out.println();

        System.out.printf("%-20s %-18s %-18s\n", "Họ tên", "Email", "Số điện thoại");
        System.out.printf("%-20s %-18s %-18d\n", "Bùi Văn Hiên", "hien@gmail.com", 25);
        System.out.printf("%-20s %-18s %-18d\n", "Nguyễn Thị Thu Hằng", "hien@gmail.com", 27);
        System.out.printf("%-20s %-18s %-18d\n", "Bùi Phương Loan", "hien@gmail.com", 18);
    }
}
