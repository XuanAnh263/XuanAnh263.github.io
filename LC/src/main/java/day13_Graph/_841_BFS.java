package day13_Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _841_BFS {
    //sử dụng BFS
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true; // Bắt đầu từ phòng đầu tiên

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0); // Thêm phòng đầu tiên vào hàng đợi

        while (!queue.isEmpty()) {
            int room = queue.poll(); // Lấy phòng đầu tiên trong hàng đợi

            for (int key : rooms.get(room)) { // Duyệt qua các chìa khóa của phòng đó
                if (!visited[key]) { // Nếu phòng chưa được mở
                    visited[key] = true; // Đánh dấu phòng đã được mở
                    queue.offer(key); // Thêm phòng mới vào hàng đợi
                }
            }
        }

        for (boolean v : visited) { // Kiểm tra xem tất cả các phòng đã được mở hay chưa
            if (!v) {
                return false;
            }
        }

        return true;
    }

}
