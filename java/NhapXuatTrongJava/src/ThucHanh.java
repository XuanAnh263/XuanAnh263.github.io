import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a ");
        int a = sc.nextInt();

        System.out.println("Nhập vào b: ");
        int b = sc.nextInt();


        int sum = a + b;
        System.out.println("a + b = " + sum);


        int minus = a - b;
        System.out.println("a - b = " + minus);


        int multi = a * b;
        System.out.println(" a * b = " + multi);


        double division = a / b;
        System.out.println(" a / b = " + division);


        double square = Math.pow(a, 3);
        System.out.println("a^3 = " + square);

        //System.out.println("a % b = ");

        System.out.println(

        );

    }
}
