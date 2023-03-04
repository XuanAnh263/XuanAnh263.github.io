package day13_Graph;

import java.util.List;

public class _841_KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        //mở phòng đầu tiên
        visited[0] = true;
        dfs(rooms,visited, 0);
        for (boolean room : visited) {
            if (!room) { //còn phòng chưa được mở
                return false;
            }
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, boolean[] visited, int room) {
        for (int key : rooms.get(room)) {
            if (!visited[key]) { //nếu phòng chưa đc mở
                visited[key] = true;
                //duyệt tiếp các phòng có thể mở được từ phòng hiện tại
                dfs(rooms, visited, key);
            }
        }
    }
}
