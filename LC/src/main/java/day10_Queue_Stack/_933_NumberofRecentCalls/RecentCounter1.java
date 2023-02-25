package day10_Stack_Queue._933_NumberofRecentCalls;

public class RecentCounter1 {
    public static class MyLinkedListQueue {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        static class Node {
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
            }
        }

        public MyLinkedListQueue() {
        }

        int size;
        Node head = null, tail = null;

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void add(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            size++;
        }

        public int pop() {
            if (head == null) {
                return -1;
            }
            int value = head.val;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            size--;
            return value;
        }

        public int peek() {
            return head.val;
        }
        public void RecentCounter1() {

        }
        public int ping(int t) {
            while (!queue.isEmpty() && t - queue.peek() > 3000) {
                queue.pop();
            }
            queue.add(t);
            return queue.size;
        }

    }
}
