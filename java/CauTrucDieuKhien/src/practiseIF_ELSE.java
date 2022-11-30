import java.util.Scanner;

public class practiseIF_ELSE {
    public static void main(String[] args) {
        //2.
        int mark = 75;
        if (mark >= 85) {
            System.out.println("A");
        } else if (mark >= 70 && mark < 85) {
            System.out.println("B");
        } else if (mark >= 40 && mark < 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        //1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("height = ");
        double height = scanner.nextInt();

        System.out.println("weight = ");
        double weight = scanner.nextInt();

        double bmi = weight / (height * height);
        System.out.println("Chỉ số bmi là : " + bmi);

        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi >= 18.5 && bmi <= 24.9 ) {
            System.out.println("bình thường");
        } else {
            System.out.println("thừa cân");

        }


    }
}
