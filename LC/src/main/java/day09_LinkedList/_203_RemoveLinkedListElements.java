package day09_LinkedList;

public class _203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        //neu danh sach rong, tra ve null
        if (head == null) {
            return null;
        }

        //xoa cac nut dau tien co gia tri = val
        while (head != null && head.val == val) {
            head = head.next;
        }

        //sau khi loai bo cac nut dau tien co gia tri = val, ta khoi tao 1 con tro curr tro toi nut dau tien = head
        ListNode current = head;

        //xoa cac nut con lai co gia tri = val
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                //neu gia tri cua curr = val, ta bo qua no bang cach curr.nexxt = curr.next.next
                current.next = current.next.next;
            } else {
                //neu gia tri curr != val
                current = current.next;
            }
        }

        return head;

    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
