package day05_BinarySearch;

public class _35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;//tìm kiếm giá trị target trong phạm vi từ đầu đến cuối mảng
        while (left <= right) {
            int mid = (left + right) / 2;
            // dùng if else so sánh giá trị tại mid và target
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; //ko tìm thấy target trong mảng, vị trí chèn sẽ là vị trí mà giá trị mới nhất right < target
    }
}
