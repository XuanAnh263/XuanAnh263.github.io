package day07_MiniTest;

public class _832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        // duyệt qua mỗi hàng trong ma trận ảnh, rồi đảo ngược giá trị của từng phần tử trong hàng đó
        // (đổi 0 thành 1 và 1 thành 0) bằng cách sử dụng toán tử XOR với 1. Sau đó, chúng ta sẽ hoán vị giá trị của
        // hai phần tử đối xứng với nhau để đảo ngược thứ tự các phần tử trong hàng


        int n = image.length;
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            //dùng while để đảo ngược và đổi giá trị của L và R
            while (left < right) {
                //sử dụng phép toán ^ (XOR) để đảo ngược giá trị của từng phần tử
                int temp = image[i][left] ^ 1; //temp lưu giá trị tạm thời sau khi đã đảo ngược

                //đổi chỗ giá trị của L và R
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                //trỏ tới phần tử tiếp theo trong hàng
                left++;
                right--;
            }
            if (left == right) {
                //khi 2 biến bằng nhau thì hàng có s phần tử là số lẻ lại đảo ngược giá trị tiếp
                image[i][left] ^= 1;
            }
        }
        //thực ra e vẫn chưa hiểu lắm. chỉ mới hiểu sơ sơ @@
        return image;

    }
}
