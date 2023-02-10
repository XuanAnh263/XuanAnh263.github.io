package day05_BinarySearch;

public class _374_GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);//gọi hàm gues(mid) để xác định và cập nhập
            if (result == 0) {//so sánh kết quả với giá trị để tìm số pick
                return mid;
            } else if (result == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } //chạy vòng lặp đến khi ko thỏa mãn dk nữa thì trả về -1
        return -1;
    }

//     private int guess(int num) {
//         int pick = 6;//lấy pick ở Exam 1
//         return num;
//     }
}
