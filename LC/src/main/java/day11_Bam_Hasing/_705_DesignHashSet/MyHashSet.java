package day11_Bam_Hasing._705_DesignHashSet;

import day11_Bam_Hasing._706_DesignHashMap.MyHashMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyHashSet {
    private static final int SIZE = 10000;
    private List<Node>[] buckets;
    public MyHashSet() {
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }

    }
    private int hashFunctiomn(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        //tìm index
        int hashIndex = hashFunctiomn(key);
        List<Node> bucket = buckets[hashIndex];
        Node node = new Node(key);
        int indexOfKey = bucket.indexOf(node);
        if (indexOfKey != -1) {
            bucket.add(node);
        } else {
            //bucket đã có node rồi, ko làm gì nữa
        }
    }

    public void remove(int key) {
        //tìm index
        int hashIndex = hashFunctiomn(key);
        List<Node> bucket = buckets[hashIndex];
        Node node = new Node(key);
        bucket.remove(node);
    }

    public boolean contains(int key) {

        //tìm index
        int hashIndex = hashFunctiomn(key);
        List<Node> bucket = buckets[hashIndex];
        Node node = new Node(key);
        int indexOfKey = bucket.indexOf(node);
        //index = -1 : ko tồn tại
        //index = 1 : có tồn tại
        return indexOfKey != -1;
    }

    static class Node {
        int key;

        Node(int key) {
            this.key = key;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return key == node.key;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }
    }
}
