package day09_LinkedList;

public class _21_MergeTwoSortedLists {
    //yeu cau: hop nhat 2 list da sort thanh 1 newlist da sort
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fakeButton = new ListNode(0); //khoi tao 1 nut gia
        ListNode current = fakeButton; // con tro hien tai tro den nut gia

        //su dung while de duyet qua list 1, 2 va so sanh gia tri cua 2 nut hien tai cua list.
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1; //noi nut hien tai trong list1 vao newlist
                list1 = list1.next; //va di chuyen con tro list1 den nut tiep theo
            }else {
                current.next = list2; //noi nut hien tai trong list2 vao newlist
                list2 = list2.next; //di chuyen con tro list2 den nut tiep theo
            }

            //sau do di chuyen con tro hien tai curr den nut vua duoc them vao newlist
            current = current.next;
        }

        //noi dnah sach chua duoc duyet het vao dnah sasch moi
        if (list1 != null) { //neu list1 chua duoc duyet het ta noi danh sach con lai vao newlist
            current.next = list1;
        } else { //neu ko, ta noi danh sach con lai trong list2 vao newlist
            current.next = list2;
        }

        //tra ve danh sach moi bang cach bo qua nut gia dau tien
        return fakeButton.next;
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
