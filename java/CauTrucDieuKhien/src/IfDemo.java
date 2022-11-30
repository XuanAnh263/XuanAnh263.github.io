public class IfDemo {
    public static void main(String[] args) {

        // Ví dụ
        int hour = 6;
        if (hour < 12) {
            System.out.println("good morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("good afternoon");
        } else {
            System.out.println("good evening");
        }


        // kết hợp nhiều điều kiện &&, ||, !
        boolean troDep = true;
        boolean coTien = true;
        if (troDep && coTien) {
            System.out.println("đi chơi");
        }

        if (troDep || coTien) {
            System.out.println("đi chơi lần 2");
        }


        // toán tử 3 ngôi
        String message = (troDep && coTien) ? "đi chơi lần 3" : "ở nhà";
        System.out.println(message);

        int number = 0;
        String text = number > 0 ? "số dương" :
                number == 0 ? "số 0" : "số âm";
        System.out.println(text);
    }
}
