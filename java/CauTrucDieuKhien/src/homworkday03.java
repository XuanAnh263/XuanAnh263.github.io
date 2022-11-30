public class homworkday03 {
    public static void main(String[] args) {
        System.out.println(repeatString("a"));
        System.out.println(repeatString1("a"));;
        System.out.println(repeatString2("a", 5));
        System.out.println(sumNumber());
        System.out.println(sphericalVolume(4));
    }
    
    //1.
    public static String repeatString(String str) {
        String rs = "";
        for (int i = 0; i < 10 ; i++) {
            rs += str;
        }
        return rs;
    }

    //2.
    public static String repeatString1(String str1) {
        String rs1 = "";
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                rs1 += str1;
            } else {
                rs1 += "-" + str1;
            }
        }
        return rs1;
    }

    //3.
    public static String repeatString2(String str2, int count) {
        String rs2 = "";
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                rs2 += str2;
            } else {
                rs2 += "-" + str2;
            }
        }
        return rs2;
    }


    //4.
    public static int sumNumber() {
        int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }


    //5.
    public static double sphericalVolume(double r) {
        double V = (4 * Math.PI * Math.pow(r, 3)) / 3;
        return V;
    }
}
