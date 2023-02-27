package day11_Bam_Hasing;

import java.util.HashSet;
import java.util.Set;

public class _771_Jewels_AndStones {
    public int numJewelsInStones(String jewels, String stones) {
//        ta cần đếm số lượng ký tự trong chuỗi stones xuất hiện trong chuỗi jewels
//        ---> sử dụng 1 Set<Character> để lưu các ký tự trong chuỗi jewels
        Set<Character> set = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (char c: stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;

    }
}
