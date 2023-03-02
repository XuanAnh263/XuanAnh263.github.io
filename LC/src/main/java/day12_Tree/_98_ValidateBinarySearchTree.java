package day12_Tree;

public class _98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return checkBST(root, null, null);
    }

    private boolean checkBST(TreeNode node, Integer min, Integer max) {
        // sử dụng ệ quy để quyệt qua các node trong cây
        if (node == null) {
            return true;
        }
        //kiểm tra xem node.val có hợp lệ ko
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        return checkBST(node.left, min, node.val) && checkBST(node.right, node.val, max);
    }
}
