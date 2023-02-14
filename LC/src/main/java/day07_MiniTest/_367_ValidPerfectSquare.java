package day07_MiniTest;

public class _367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        //để kiểm tra xem 1 số nguyên có phải là số chính phương hoàn hảo hay ko
        //sử dụng nhị phân để tìm căn bậc 2 của số đó.
        //thuật toán tìm kiếm nhị phân giúp tìm kiếm 1 khoảng giá trị có thể chứa căn bậc hai của số đó
        //và sau đó tìm kiếm từng giá trị tỏng khoảng đó để kiểm tra xem có bằng số đó hay ko

        long l =1;
        long r = num;

        //dùng while để tìm kiếm căn bậc 2
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long squaredMid = mid * mid;

            if (squaredMid == num) {
                return true;
            } else if (squaredMid < num) {
                // di chuyển khoảng giá trị tìm kiếm sang phải
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}
