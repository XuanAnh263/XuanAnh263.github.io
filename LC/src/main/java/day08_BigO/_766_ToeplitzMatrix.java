package day08_BigO;

public class _766_ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i-1][j-1] ) {
                    return false;
                }
            }
        }
        return true;
    }
    //TH1 : ma trận không phải ma trận vuông (m, n)
    //ta sử dụng 2 vòng lặp for để duyệt qua từng phần tử của ma trận --> thời gian thực thi sẽ phụ thuộc vào số hàng và số cột của ma trận (ký hiệu là m và n)
    //trong mỗi vòng lặp, thực hiện 1 số thao tác cố định, bao gồm so sánh giá trị của phần tử hiện tại với phân tử nằm trên đường chéo bên trái của nó
    //vì duyệt qua mỗi phần tử tỏng ma trận, nên thời gian thực thi sẽ là O(mn)
    //về không gian lưu trữ, code ta chỉ sử dụng  các biến đếm và không cn bất kì mảng hay cấu trúc dữ liệu khác
    //do đó ko tốn bộ nhớ phụ thuộc vào kích thước ma trận
    //--> độ phức tạp thời gian của thuật toán là O(mn), độ phức tập ko gian là O(1)

    //TH2 : nếu ma trận là ma trận vuông (m = n)
    //chỉ xem xét 1 yếu tố duy nhất ảnh hưởng đến thời gian thực thi của thuật toán là số phần tử trong ma trận (n)
    //vẫn duyệt qua từng phần tử của ma trận thông qua vòng lặp for
    //vòng lặp đầu sẽ chạy n lần, vòng lặp thứ 2 cũng sẽ chạy n lần
    //vì vòng lặp for thứ 2 được thực hiện trong vòng lặp for đầu tiên, do đó s lần lặp lại của vòng lặp for thứ 2 sẽ là tổng của các số tự nhiên từ 1 --> n
    //--> công thức : 1 + 2 + ... + n -1 + n = n(n + 1)/2
    //--> độ phức thời gian của thuật toán tạp là O(n^2)

}
