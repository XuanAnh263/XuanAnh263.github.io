

public class homeWork {
    public static void main(String[] args) {
        //1.
        String sayHeloo = "Xin chào các bạn.";
        System.out.println(sayHeloo);
        //2.
        String hello = "mọi người";
        System.out.println("Xin chào " + hello);
        //3.
       char nhay = 34;
        System.out.println("Xin chào " +  nhay + hello + nhay ) ;
        //4.
        int tong = sum(234, 45);
        System.out.println("Tổng = " + tong);
        //5.
        int x = 25;
        int y = 2;
        System.out.println("Bình phương = " + Math.pow(x, y));
        //6. 
        short getTheky = (short) Math.ceil(theKy(2022));
        System.out.println("Thế kỷ : " + getTheky);
        //7.
       double weight = 70, height = 173, bmi;
       bmi = weight / Math.pow(height, 2) * 10000;
        System.out.println("Chỉ số BMI = " + bmi);

    }




    public static int sum(int a, int b) {
        return a + b;
    }

    public static int box(int x, int y) {
        return (int) Math.pow(x, y);
    }

    public static double theKy(double a) {
        return a / 100;
    }

    public static double bmi(double weight, double height) {
        return bmi(weight, height);
    }
}
