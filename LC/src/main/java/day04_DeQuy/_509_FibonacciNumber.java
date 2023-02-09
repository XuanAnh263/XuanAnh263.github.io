package day04_DeQuy;

public class _509_FibonacciNumber {
    public int fib(int n) {
        //Trong đó, hàm fib sử dụng phương pháp đệ quy để tìm số Fibonacci tại vị trí N. Nếu N <= 1, nó trả về N.
        // Nếu không, nó tìm số Fibonacci tại vị trí N-1 và N-2 và trả về tổng của hai số đó.
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
