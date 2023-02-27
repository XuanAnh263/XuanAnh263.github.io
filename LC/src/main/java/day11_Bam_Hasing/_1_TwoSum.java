package day11_Bam_Hasing;

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //khởi tạo 1 map để lưu trữ các phần tử trong mảng cùng index tương ứng
        Map<Integer, Integer> map = new HashMap<>();

        //duyệt mảng
        for (int i = 0; i < nums.length; i++) {
//            target = nums[i] + x; --> x = target - nums[i]
            int complement = target - nums[i];

//            dùng containsKey kiểm tra xem complement đã có trong map chưa
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            }

//            nếu complement ko có trong map, ta thêm cặp k, v vào map để tiếp tục tìm kiếm
            map.put(nums[i], i);
        }

//        nếu vẫn ko tìm được cặp k, v thỏa mãn --> ta sẽ ném ra 1 ngoại lệ
        throw new IllegalArgumentException("No two sum solution");
    }
}
