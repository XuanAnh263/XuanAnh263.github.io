import java.util.Scanner;
import java.util.Arrays;

public class Homeworkday_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
        String fullName;
        System.out.println("\n\nNhập họ và tên : ");
        fullName = scanner.nextLine();

        //khai báo một mảng, sau đó sử dụng phương thức toCharArray()
        //để chuyển đổi fullName thành một mảng kiểu char
        char[] charArray = fullName.toCharArray();
        boolean foundSpace = true;

        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for (int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if (Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if (foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }

        // chuyển đổi mảng char thành string
        fullName = String.valueOf(charArray);
        System.out.println("Họ và tên sau khi in hoa : \n" + fullName);

        System.out.println("\n---------------------------------");

        //2.
        int option;
        int n = 0;
        int[] arr = new int[n];
        int[] newArr = new int[n];


        for (; ; ) {
            showMenu();

            do {
                System.out.print("Nhập lựa chọn : ");
                option = scanner.nextInt();
            } while (option < 1 || option > 5);

            switch (option) {
                case 1: {
                    System.out.println("Thực hiện chức năng 1: ");
                    System.out.print("Nhập vào số phần tử trong mảng: ");
                    n = scanner.nextInt();
                    arr = new int[n];
                    newArr = new int[n];
                    break;
                }
                case 2: {
                    if (n == 0) {
                        warning();
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.println("Thực hiện chức năng 2: ");
                            System.out.printf("Nhập vào phần tử thứ %d: ", i);
                            arr[i] = scanner.nextInt();
                        }
                    }
                    break;
                }
                case 3: {
                    if (n == 0) {
                        warning();
                    } else {
                        System.out.println("Thực hiện chức năng 3: ");
                        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
                    }
                    break;
                }
                case 4: {
                    if (n == 0) {
                        warning();
                    } else {
                        for (int i = 0; i < n; i++) {
                            newArr[i] = arr[i];
                            if (arr[i] % 2 == 0) {
                                newArr[i] = arr[i] + 1;
                            }
                        }
                        System.out.println("Thực hiện chức năng 4: ");
                        System.out.println("Mảng mới là: " + Arrays.toString(newArr));
                    }
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
            }

        }
    }

    public static void warning() {
        System.out.println("Chưa tạo mảng, hãy tạo mảng trước!");
    }

    public static void showMenu() {
        System.out.println("\n----------MENU----------");
        System.out.println("1. Nhập số phần tử của mảng");
        System.out.println("2. Nhập các phần tử của mảng");
        System.out.println("3. In mảng ra màn hình");
        System.out.println("4. Thay đổi các phần tử là số chẵn tăng lên 1 đơn vị");
        System.out.println("5. Thoát");
    }


}
