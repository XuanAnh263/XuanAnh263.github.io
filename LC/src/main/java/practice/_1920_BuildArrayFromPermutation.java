package practice;

public class _1920_BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = nums[nums[i]];
        }
        return target;
    }
}
