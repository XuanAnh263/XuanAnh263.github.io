import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt();
        System.out.println("Số ngẫu nhiên được sinh ra là " + num);
        System.out.println("Có phải số nguyên tố hay không : " + isPrimeNumber(num));
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
