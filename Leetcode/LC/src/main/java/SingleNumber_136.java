import java.util.ArrayList;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                list.remove((Integer) nums[i]);
            }else {
                list.add(nums[i]);
            }
        }
        return list.get(0);
    }
}
