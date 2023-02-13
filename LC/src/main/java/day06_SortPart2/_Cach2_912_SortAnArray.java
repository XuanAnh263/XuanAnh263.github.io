package day06_SortPart2;

public class _Cach2_912_SortAnArray {
    //cách này đang bị Time Limit Exceeded
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            //vòng lặp đầu, duyệt qua từng phần tử trong mảng
            int minIndex = i; //biến minIndex lưu trữ vị trí của phần tử nhỏ nhất trong mảng
            for (int j = i + 1; j < nums.length; j++) {
                //vòng lặp thứ 2, duyệt qua phần tử còn lại trong mảng (start: i+1, end: cuối mảng), để tìm phần tử nhỏ nhất
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) { //nếu minInđex khác i thì hoán vị trí hai phần tử tại vị trí i và index (sử dụng biến tạm temp)
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums;
    }

}
