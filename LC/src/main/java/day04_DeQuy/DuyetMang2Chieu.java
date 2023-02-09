package day04_DeQuy;

public class DuyetMang2Chieu {

    static void printArray(int[][] arr, int i, int j) {
        if (i == arr.length) {
            //nếu i bằng chiều dài của mảng (tức là i == arr.length), ta sẽ trả về hàm.
            // Điều này có nghĩa là ta đã duyệt hết mảng và không cần thực hiện in ra nữa.
            return;
        }
        if (j == arr[i].length) {
            //Nếu j bằng chiều rộng của mảng tại vị trí i (tức là j == arr[i].length),
            // ta sẽ gọi đến hàm printArray với i + 1 và 0 để duyệt dòng tiếp theo.
            printArray(arr, i + 1, 0);
            return;
        }

        //Nếu cả i và j đều không bằng chiều dài hoặc chiều rộng của mảng,
        //ta sẽ in ra phần tử tại vị trí [i][j] và gọi đến hàm printArray với i và j + 1 để duyệt sang phần tử tiếp theo trong cùng dòng.
        System.out.print(arr[i][j] + " ");
        printArray(arr, i, j + 1);
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        printArray(arr, 0, 0);
    }
}
