package day11_Bam_Hasing;

import java.util.HashMap;
import java.util.Map;

public class _387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        //khởi tạo countMap để đếm số lần xuất hiện của các ký tự trong chuôi
        Map<Character, Integer> countMap = new HashMap<>();
        //duyệt mảng và đếm số lần xuất hiện của mỗi ký t
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //getOrDefault : truy xuất giá trị tương ứng với key c
                          // nếu trong Map có key c thì trả về val tương ứng
                           // ---> và + 1 để update số lần xuất hiện

                          // nếu ko thì sẽ trả về giá trị mặc định defaultVal (0)
                            // ---> và + 1 để update số lần xuất hiện
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        //Tìm vị trí đầu tiên xuất hiện duy nhất
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
