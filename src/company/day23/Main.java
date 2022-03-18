package company.day23;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1,6);
//        linkedList.delete(0);
        linkedList.add(0,7);

//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }

        for (int x : linkedList) {
            System.out.println(x);
        }

    }
}
