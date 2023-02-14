package day07_MiniTest;

import java.util.Arrays;
import java.util.Comparator;

public class _2418_SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        //khởi tạo mảng peple(mảng 2 chiều) để lưu tên và chiều cao
        //số lượgn phần tử của mảng people = mảng names và mảng height
        String[][] people = new String[n][2];
        for (int i = 0; i < n; i++) {
            people[i][0] = names[i];//lưu tên của people
            people[i][1] = String.valueOf(heights[i]); //lưu chiều cao
        }

        //sắp xếp mảng people theo thứ tự giảm dần theo height
        //Sử dụng Arrays.sort
        Arrays.sort(people, new Comparator<String[]>() { //comparatỏ để so sánh
            @Override
            public int compare(String[] a, String[] b) {

                // Nếu height của a > height của b thì đưa a lên trước
                if (Integer.parseInt(a[1]) > Integer.parseInt(b[1])) {
                    return -1;
                }
                // Nếu height của a < height của b thì đưa a xuống dưới
                else if (Integer.parseInt(a[1]) < Integer.parseInt(b[1])) {
                    return 1;
                }
                // Nếu height của a = height của b thì sắp xếp theo thứ tự tăng dần của tên
                else {
                    return a[0].compareTo(b[0]);
                }
            }
        });

        //tạo mảng result để lưu tên người theo thứ tự đã sắp xếp
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = people[i][0];
        }
        return result;

        // Bài này e cũng mới hiểu sơ sơ @@ thấy easy nhưng thật ra là medium mới đúng ạ
    }
}
