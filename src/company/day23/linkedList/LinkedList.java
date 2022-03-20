package company.day23.linkedList;


import company.day23.List;

import java.util.Iterator;

public class LinkedList implements List {

    private static int size;


    private static class Node {

        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    @Override
    public void add(int val) {
        if (head == null) {
            head = new Node(val, null);
            size++;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = head.next;
        }
        node.next = new Node(val, null);
        size++;
    }

    @Override
    public void add(int index, int val) {
        if (head == null) {
            head = new Node(val, null);
            size++;
            return;
        }
        if (index ==0){
            head=new Node(val,head);
            size++;
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node constant = node.next;
        node.next = new Node(val, constant);
        size++;
    }

    @Override
    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = head.next;
        }
        node.next = node.next.next;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < size ; i++) {
            s.append(this.get(i)).append("->");
        }
        s.append(("null]"));
        return s.toString();
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Integer>{

        private int size;
        private Node node = head;

        @Override
        public boolean hasNext() {
            return this.size<LinkedList.size;
        }

        @Override
        public Integer next() {
            Integer value = node.val;
            node=node.next;
            size++;
            return value ;
        }
    }

}
