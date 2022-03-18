package company.day23;


public class LinkedList implements List {

    private static int size;

    private class Node {

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
        if (index==0){
            head = head.next;
        }
        Node node = head;
        for (int i = 0; i < index-1; i++) {
            
        }

    }

}
