package day07_MiniTest;

public class _1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        // tìm số lượng cặp phần tử trong mảng có cùng giá trị và vị trí của phần tử đầu tiên trong cặp phải < vị trí phần tử thứ 2 trong cặp
        //Ví dụ trên, trong mảng nums = [1,2,3,1,1,3], có 4 cặp phần tử có cùng giá trị và vị trí đầu tiên
        // trong cặp đầu tiên (0, 3) phải nhỏ hơn vị trí trong cặp thứ hai (1, 4), và tương tự cho các cặp khác.


        int count = 0; //biến đếm, lưu trữ số lượng cặp (i,j) để thoả mãn đk nums[i] == nums[j] and i < j

        //sử dụng mảng frequent có độ dài 101 (0->100) (vì 1 <= nums.length <= 100 theo để bài)
        //mảng này để lưu tần suất xuất hiện của các phần tử
        int[] frequent = new int[101];
        for(int num : nums) {
            count += frequent[num]; //đại diện cho số lượng cặp có thể được tạo ra bởi phần tử num
            // và các phần tử trước đó đã xét
            frequent[num]++;
        }
        return count;
    }
}
