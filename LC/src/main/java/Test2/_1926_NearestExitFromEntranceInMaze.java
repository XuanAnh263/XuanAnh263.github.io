package Test2;

import java.util.LinkedList;
import java.util.Queue;

public class _1926_NearestExitFromEntranceInMaze {
    //Bài này căng quá thầy ơi, gọi học bá rồi mà e vẫn chưa load được -_-
    public int nearestExit(char[][] maze, int[] entrance) {
        //sử dụng thuật toán bfs để tìm đường đi từ điểm entrance đến điểm gần nhất trên biên của ma trận maze
        int m = maze.length; //số hàng
        int n = maze[0].length; //số cột
        //các mảng dùng để điều hướng tìm kiếm (up, down, l, r)
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        Queue<int[]> queue = new LinkedList<>();//khởi tạo Queue
        queue.offer(new int[]{entrance[0], entrance[1], 0}); //bắt đầu tìm kiếm từ entrance
        maze[entrance[0]][entrance[1]] = '+'; //đánh đấu điểm này đã đc xét = '+'

        while (!queue.isEmpty()) {
            int[] curr = queue.poll(); // lấy và lưu phân tử đầu tiên của hàng đợi
            //tọa độ x,y và bước đi steps của từng mảng curr
            int x = curr[0];
            int y = curr[1];
            int steps = curr[2];

            if (x == 0 ||y ==0 || x == m -1 || y == n -1) {
                //kiểm tra xem tọa độ hiên tại x,y có phải là 1 điểm trên biên của ma trận ko
                if (!(x == entrance[0] && y == entrance[1])) { //kiểm tra xem điểm đó có phải là điểm entrace ko, nếu ko phải thì trả về steps
                    return steps;
                }
            }
            //duyệt qua 4 hướng từ tọa độ x,y
            for (int i = 0; i < 4; i++) {
                //lấy tọa độ mới nx, ny bằng cách cộng độ dịch chuyển dx[i] và dy[i] lần lượt vào x v y
                int nx = x + dx[i];
                int ny = y + dy[i];

                //check tọa độ mới có nằm trong ma trận ko và có phải là ô trống '.' ko
                if (nx >= 0 && ny >= 0 && nx < m && ny< n && maze[nx][ny] == '.') {
                    maze[nx][ny] = '+'; //nếu đúng thì đánh dấu ô đó đã được đi qua
                    queue.offer(new int[]{nx, ny, steps + 1}); //thêm tọa độ mới và số bước đi mới vào hàng đợi
                }
            }
        }
        //ko tìm thấy đuường đi thì trả về -1
        return -1;
    }
}
