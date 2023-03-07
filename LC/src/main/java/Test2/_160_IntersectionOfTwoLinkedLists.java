package Test2;

public class _160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //check null cases
        if (headA == null || headB == null) {
            return null;
        }

        //sử dụng 2 con trỏ nodeA và nodeB, mỗi con trỏ đi qua 1 dnah sách liên kết
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != nodeB) {
            //di chuyển nodeA và nodeB cùng lúc, mỗi lần di chuyển 1 bước đến phần tử tiếp theo của danh sách liên kết tương ứng
            // nếu nodeA và nodeB đã đến cuối dnah sách liên kết của mình, thì sẽ cho nó trỏ đến đâ dnah sách liên kết của đối phương
            //cụ thể:
            //Nếu nodeA đang trỏ đến null, ta sẽ cho nó trỏ đến đầu danh sách liên kết B, tức là bắt đầu duyệt danh sách B
            nodeA = nodeA == null ? headB : nodeA.next;
            //nếu nodeB đang trỏ đến null, ta sẽ cho nó trỏ đến đầu danh sách liên kết A.
            nodeB = nodeB == null ? headA : nodeB.next;
        }
        return nodeA;
    }

    //độ phức tạp thuật toán là O(m + n), m và n là độ dài của 2 danh sch liên kết A và B.
    //ta duyệt qua cả 2 dnah sách liên kết để tìm nút giao nhau, nhưng mỗi nút chỉ được truy cập 1 lần.
}
