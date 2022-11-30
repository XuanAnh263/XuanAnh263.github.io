//public class ForDemo {
//    public static void main(String[] args) {
//        1. Thực hiện cv thực dậy lúc 5:00 trong vòng 30 ngày
//        for (int day = 1; day <= 30; day++) {
//            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
//        }
//
//        //2. Ngày chẵn dạy lúc 5h và ngày lẻ dậy 7h
//            //Cách 1:
//            for (int day = 1; day <= 30; day++) {
//                if (day % 2 == 1) {
//                    System.out.println("Ngày " + day + " thức dậy lúc 5:00");
//                } else {
//                    System.out.println("Ngày " + day +  " thức dậy lúc 7:00");
//                }
//            }
//            //Cách 2:
//            for (int day = 1; day <= 30; day += 2) {
//                System.out.println("Ngày " + day + " thức dậy lúc 5:00");
//            }
//
//        //3. Thực hiện đến ngày số 20, chán quá ==> không thực hiện nữa
//        for (int day = 1; day <= 30; day++) {
//            if (day == 20) {
//                System.out.println("chán quá, từ bỏ");
//                break;
//            }
//            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
//        }
//
//        //4. Vẫn thực hiện cv nhưng cuối tuần nghỉ không thực hiện
//        for (int day = 1; day <= 30; day++) {
//            if (day % 7 == 0) {
//                System.out.println("tạm nghỉ");
//                continue;
//            }
//            System.out.println("Ngày " + day + " thức dậy lúc 5:00");
//        }
//
//
//        //Tính tổng tiền tiết kiệm
//        //Tiết kiệm trong 10 ngày, mỗi ngày 100.000
////        int total = 0;
////        for (int day = 1; day <= 10; day++) {
////            total += 100_000;
////        }
////        System.out.println("Tổng tiền : " + total );
//
//        //Đến ngày thứ 5, tiết kiệm mỗi ngày 200.000
//        int total = 0;
//        for (int day = 1; day <= 10; day++) {
//            if (day >= 5) {
//                total += 200_000;
//            } else {
//                total += 100_000;
//            }
//        }
//        System.out.println("Tổng tiền : " + total );
//
//        // Đến ngày thứ 8 bạn rủ đi nhậu, lấy 500.000 trong tiết kiệm ra
//        for (int day = 1; day <= 10; day++) {
//            if (day == 8) {
//                total -= 500_000;
//            }
//            if (day >= 5) {
//                total += 200_000;
//            } else {
//                total += 100_000;
//            }
//        }
//        System.out.println("Tổng tiền : " + total );
//
//
//
//        //Practise
//        System.out.println(repeatString("abc"));
//
//
//    }
//
//    public static String repeatString(String str) {
//        String rs = "";
//        for (int i = 0; i <= 10; i++) {
//            rs += str;
//        }
//        return rs ;
//    }
//
//    public static String repeatString(String str, int count) {
//        String rs = "";
//        for (int i = 0; i <= count; i++) {
//            rs += str;
//        }
//        return rs ;
//    }
//}