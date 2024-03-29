package day04_DeQuy;

public class _50_Pow {
    public double myPow(double x, int n) {
        // Hàm myPow sử dụng phương pháp nhanh để tính x^n. Nếu n = 0, nó trả về 1.
       
        
        if (n == 0) {
            return 1;
        }
          // Nếu n = Integer.MIN_VALUE, nó chia n cho 2 và nhân x cho x. 
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        
        // Nếu n < 0, nó chuyển n thành dương và đảo chiều x.
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        
        // Sau đó, nó dùng vòng lặp để tính x^n một cách hiệu quả.
        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }
}
