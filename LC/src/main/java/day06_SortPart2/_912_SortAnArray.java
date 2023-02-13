package day06_SortPart2;

public class _912_SortAnArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void quickSort(int[] nums, int left, int right) {
        //đệ quy để sắp xếp mảng
        if (left >= right) {
            return;
        }

        int pivot = nums[(left + right) / 2];

        //dùng partition để phân chia mảng thành 2 phần
        int index = partition(nums, left, right, pivot);
        quickSort(nums, left, index - 1);
        quickSort(nums, index, right);
    }

    private int partition(int[] nums, int left, int right, int pivot) {
        //phân chia mảng bằng cáhc sử dụng pivot
        //với mỗi vòng lặp, duyệt mảng từ 2 phía
        while (left <= right) {
            while (nums[left] < pivot) {
                left++;
            }

            while (nums[right] > pivot) {
                right--;
            }


            if (left <= right) {
                //tìm giá tị nhỏ - lớn hơn pivot và hoán vị
                swap(nums, left, right);
                //sau khi hoán vị thì tăng L và giảm R
                left++;
                right--;
            }
        }

        return left;
    }

    private void swap(int[] nums, int i, int j) {
        //hoán vị giá trị trong mảng
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
