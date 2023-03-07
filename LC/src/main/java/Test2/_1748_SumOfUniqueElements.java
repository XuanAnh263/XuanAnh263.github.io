package Test2;

import java.util.HashMap;
import java.util.Map;

public class _1748_SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        // Khởi tạo một map để đếm số lần xuất hiện của từng phần tử
        Map<Integer, Integer> countMap = new HashMap<>();
        // Đếm số lần xuất hiện của từng phần tử trong mảng nums và lưu vào map
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        // Duyệt qua các entry trong map và tính tổng các phần tử chỉ xuất hiện đúng 1 lần
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        // Trả về tổng các phần tử chỉ xuất hiện đúng 1 lần
        return sum;
    }

    //Độ phức tạp thuật toán O(n), n là số lượng phần tử trong mảng nums.
}
