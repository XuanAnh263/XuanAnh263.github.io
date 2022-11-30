public class IF {
    public static void main(String[] args) {
//        int i = 11;
//        if (i%2 == 0) {
//            System.out.println(i + "là số chẵn");
//        }else {
//            System.out.println(i + " là số lẻ");
//        }
//        System.out.println("done");

        // if else lồng nhau
        int a = 4;
        int b = 7;
        int c = 6;
        if (a > b) {
            if (a > c) {
                System.out.println("a là số lớn nhất");
            }else {
                System.out.println("c là số lớn nhất");
            }
        }else {
            if (b > c) {
                System.out.println("b là số lớn nhất");
            }else {
                System.out.println("c là số lớn nhất");
            }
        }

    //lồng else if trong if
        int x = 330;
        if (x == 10) {
            System.out.println("giá trị của x là 10");
        } else if (x == 20) {
            System.out.println("giá trị của x là 20");
        } else if (x == 30) {
            System.out.println("giá trị của x là 30");
        }else {
            System.out.println("x mang giá trị khác");
        }
    }
}
