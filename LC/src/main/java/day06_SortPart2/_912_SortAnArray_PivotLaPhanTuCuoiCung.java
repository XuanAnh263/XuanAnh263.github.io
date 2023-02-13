package day06_SortPart2;

public class _912_SortAnArray_PivotLaPhanTuCuoiCung {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0]; //1. trả về mảng rỗng
        }
        //2. gọi tới method quickSort
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];//lưu giá cảu phần tử cuối cùng của mảng
        int i = low - 1; //lưu vị trí của phần tử đầu tiên mà giá trị nhỏ hơn hoặc bằng pivot

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);

        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
