package day08_BigO;

public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0; // biến i duyệt từ đầu mảng
        int j = 0; // biến j duyệt từ đầu mảng, chỉ định vị trí chưa số 0
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
    //b1:
        // khởi tạo 2 biến i và j là 0
        //thời gian thực hiện là O(1), vì chỉ cần gn giá trị cho hai biến
    //b2:
        //  while (i < nums.length) duyệt qua toàn bộ mng và di chueyẻn các phần tử khác 0 lên đầu mảng
        //vòng lặp while duyệt qua toàn bộ mảng 1 lần, nên thời gian thực hiện là O(n).
        //trong mỗi vòng lặp, kiểm tra xem giá trị của phần tử hiện tại có khác 0 không.
        //nêú có , ta di chuyển phần tử đó lên đầu mảng bằng cách gán giá trị của nó cho phần tử ở vị trí j và tăng giá trị j lên 1
        //nếu phần tử hiện tại là 0, thì bỏ qua nó và tiếp tục duyệt
    //b3:
        //while (j < nums.length)
        //điền các phần tử = 0 vào cuối mảng
        //vòng lặp while này duyệt qua tất cả phân tử trong mảng 1 lần nữa, nên thời gian thực hn là O(n)
        //mỗi vòng lặp, ta gán giá trị 0 cho phần tử ở vị trí j và tăng giá trị j lên 1
    //vì thời gian thực hiện ở b2 và b3 đều là O(n) --> độ phức tạp đoạn code là O(n)
    //độ phức tạp không gian của thuật toán là O(1), do ko sử dụng bộ nhớ bổ sung. chỉ s dụng 2 bến i và j để thực hiện việc đổi chỗ các phần tử trong mảng
}
