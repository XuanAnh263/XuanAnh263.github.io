package day07_MiniTest;

public class _75_SortColors {
    public void sortColors(int[] nums) {
        //dùng three pointer
        //duyệt mảng băng 2 con trỏ l & r để đưa các phần tử có giá trị 0 và 2 vào đúng vị trí
        //con trỏ mid sẽ dùng để duyệt mảng từ đầu đến cuối và đưa các phần tử có giá trị là 1 vào giữa 0 & 2



        int n = nums.length;
        int l = 0;  // Con trỏ đầu mảng
        int r = n - 1;  // Con trỏ cuối mảng
        int mid = 0;  // Con trỏ duyệt mảng

        // Duyệt mảng từ đầu đến cuối
        while (mid <= r) {
            if (nums[mid] == 0) {
                // Nếu phần tử tại vị trí mid là 0, đưa nó về đầu mảng
                swap(nums, l, mid);
                l++;
                mid++;
            } else if (nums[mid] == 2) {
                // Nếu phần tử tại vị trí mid là 2, đưa nó về cuối mảng
                swap(nums, mid, r);
                r--;
            } else {
                // Nếu phần tử tại vị trí mid là 1, duyệt tiếp mảng
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
