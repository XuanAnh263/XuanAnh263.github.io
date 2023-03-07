package Test2;

public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];//lấy màu sắc cũ của điểm lưu vào biến oldColor
        if (oldColor != color) {
            dfs(image, sr, sc, oldColor, color);
        }
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int color) {
        if (sr < 0 || sr >= image.length
                || sc < 0 || sc >= image[0].length //điều kiện để sr, sc nằm trên ma trận
                || image[sr][sc] != oldColor) {
            return;
        }

        image[sr][sc] = color;

        //lần lượt xét 4 đỉnh có liên kết với đỉnh hiện tại (dựa trên tọa độ sr, sc)
        dfs(image, sr - 1, sc, oldColor, color);
        dfs(image, sr + 1, sc, oldColor, color);
        dfs(image, sr, sc - 1, oldColor, color);
        dfs(image, sr, sc + 1, oldColor, color);
    }
    //Trong thuật toán, duyệt qua mỗi điểm trong ma trận hình ảnh đúng 1 lần --> độ phức tạp thời gian O(n)
    //Độ phức tạp ko gian O(d), d là độ sâu của stack trong quá trình tực hiện dfs.
    //vì mỗi điểm trong ma trận hình ảnh có thể được đưa vào stack đúng 1 lần --> độ phức tạp ko gian cũng là O(n)
}
