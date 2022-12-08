import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        str = scanner.nextLine();
        String[] out = str.split("\\s");

        System.out.println("Số từ trong chuỗi = " + out.length);

        char[] arr = str.toCharArray();
        char kyTu = 'o';
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str.charAt(i) == kyTu) {
                count++;
                System.out.println("Ký tự o ở vị trí index :" + i);
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + count + " trong chuỗi " + "\"" + str + "\"" + " = " + count);

    }

}
