package day03_SortPart1;

import java.util.Arrays;

public class _1051_HeightChecker {
    public int heightChecker(int[] heights) {
        int[] reproduction = heights.clone(); //sao chep mang
        Arrays.sort(reproduction);
        int c = 0;
        for (int i = 0; i < heights.length; i++) {
            if (reproduction[i] != heights[i])  //so sanh 2 mang
                c++;
        }
        return c;
    }
}
