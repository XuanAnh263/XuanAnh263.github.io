package day12_Tree;

public class _112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // sử dụng đệ quy để quyệt

        if (root == null) { //check tree có rỗng
            return false;
        }

        // nếu node đang xét là leafNodes, check tổng val trên edge từ root đến leafNodes có bằng targetSum
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }

        //nếu node đang xét ko phải leafNodes, tiếp tục duyệt đệ quy các node.left và node.right của node đó

        //khi gọi đệ quy cho node.left truyền vào targetSum - root.val để tính tổng val từ root đến node.left.
        //tương tự node.right cũng như vậy

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

}
