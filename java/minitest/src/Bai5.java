import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số hàng : ");
        int row = scanner.nextInt();

        System.out.println("nhập vào số cột : ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("nhập vào phần tử [%d][%d]", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Thông tin mảng 1 : ");
        for (int[] subArray : array) {
            for (int number : subArray) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println("phần tử nằm trên đường chéo chính là : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.println(array[i][j]);
                }
            }

        }
        System.out.println("-----");
        int[][] array1 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("nhập vào phần tử [%d][%d]", i, j);
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Thông tin mảng 2 : ");
        for (int[] subArray1 : array1) {
            for (int number1 : subArray1) {
                System.out.print(number1 + " ");
            }
            System.out.println();
        }

        System.out.println("Mảng sau khi cộng là :");
        int[][] arrTotal = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrTotal[i][j] = array[i][j] + array1[i][j];
            }
        }

        for (int[] subArrayTotal : arrTotal) {
            for (int number : subArrayTotal) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
