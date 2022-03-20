package company.day23.linkedList;

import company.day23.arrayList.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(1,6);
//        linkedList.delete(0);
//        linkedList.add(0,7);
//
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }
//
//        for (int x : linkedList) {
//            System.out.println(x);
//        }


        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(1, 10);
        arrayList.delete(1);


        for (int x : arrayList) {
            System.out.println(x);
        }


    }
}
