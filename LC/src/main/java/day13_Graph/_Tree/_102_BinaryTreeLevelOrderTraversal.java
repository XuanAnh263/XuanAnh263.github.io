package day13_Graph._Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); //đưa root vào hàng đợi
        while (!queue.isEmpty()) {
            int leverSize = queue.size(); //lấy kích thước hiện tại của hàng đợi
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < leverSize; i++) {
                TreeNode currentNode = queue.poll(); //lấy nút đầu tiên trong hàng đợi
                currentLevel.add(currentNode.val); //đưa giá trị của nút vừa lấy vào danh sách

                //đưa các con trái phải của nó vào hàng đợi (.offer)
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            //khi đã duyệt hết --> add các danh sách currLv vào result
            result.add(currentLevel);
        }
        return result;
    }
}
