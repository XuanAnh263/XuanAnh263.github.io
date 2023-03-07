package Test2;

public class _100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //yêu cầu kiểm tra xem hai cây nhị phân có giống nhau không.
        // Giống nhau nghĩa là cả hai cây đều có cùng một cấu trúc và các nút tương ứng có cùng giá trị.
        //sử dụng đệ quy để giải quyết

        //TH cả 2 nút đều là null
        if (p == null && q == null) {
            return true;
        }
        //1 trong 2 nút là null
        if (p == null || q == null) {
            return false;
        }
        //kiểm tra giá trị của nút hiện tại
        if (p.val != q.val) {
            return false;
        }
        //so sánh các cây con của  nút hiện tại
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //vì mỗi node chỉ được truy cập đúng một lần,
    // nên độ phức tạp của thuật toán phụ thuộc vào số lượng node trong cây.
    // Với mỗi node, chúng ta chỉ thực hiện một số thao tác so sánh giá trị của node với giá trị của node tương ứng trong cây còn lại,
    // và gọi đệ quy đối với các cây con. Do đó, độ phức tạp của thuật toán là O(n). (n là số lượng node trong cây)
}
