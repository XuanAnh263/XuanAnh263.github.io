import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Homework02
        //1.
        System.out.println("lenght = " );
        int length = scanner.nextInt();
        System.out.println("height = ");
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.println("perimeter = " + (length + height) * 2);
        System.out.println("area = " + length * height);


        System.out.println();
        //2.

        System.out.println("Name : ");
        String name = scanner.nextLine();

        System.out.println("Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Gender : ");
        String gender = scanner.nextLine();

        System.out.println("Address : ");
        String address = scanner.nextLine();

        System.out.println("Xin chào các bạn, mình tên là " + name
                + ", năm nay mình " + age
                + ", giới tính " + gender
                + ". Hiện tại mình đang sống và làm việc tại " + address);


        System.out.println();
        //Practise Scanner:
        //2.

        System.out.println("Nhập vào chuỗi : ");
        String sayhello = scanner.nextLine();
        String hello = scanner.nextLine();

        System.out.println("Chuỗi in hoa của chuỗi "
                + "\"" +  sayhello + "\"" + " là : "
                + sayhello.toUpperCase() );
        System.out.println("Chuỗi in thường của chuỗi "
                + "\"" + sayhello + "\"" + " là : "
                + sayhello.toLowerCase());
        System.out.println("Số ký tự của chuỗi "
                + "\"" + sayhello + "\"" + " là : "
                + sayhello.length());
        System.out.println("Ký tự cuối cùng của chuỗi "
                + "\"" + sayhello + "\"" + " là : "
                + sayhello.charAt(sayhello.length() - 1));
        System.out.println("5 ký tự cuối của chuỗi "
                + "\"" + sayhello + "\"" + " là : "
                + sayhello.substring(0, 5));
        System.out.println("Chuỗi "
                + "\"" + sayhello + "\"" + " " + "có chứa chuỗi "
                + "\"" + hello + "\"" + "hay không : "
                + sayhello.contains(hello));
    }

}
