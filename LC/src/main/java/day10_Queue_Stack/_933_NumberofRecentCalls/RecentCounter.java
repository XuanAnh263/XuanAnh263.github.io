package day10_Stack_Queue._933_NumberofRecentCalls;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();

    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t -3000) {
            queue.poll();
        }
        return queue.size();
    }
}
