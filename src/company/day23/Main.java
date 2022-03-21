package company.day23;

import company.day23.arrayList.ArrayList;
import company.day25.ArrayListUtils;

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
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(9);

//        System.out.println(ArrayListUtils.isDuplicate(arrayList));
//        ArrayListUtils.printUniqueElement(arrayList);
//        System.out.println(ArrayListUtils.countOfDuplicate(arrayList));
//        System.out.println(ArrayListUtils.firstUniqueElement(arrayList));

//        for (int x : arrayList) {
//            System.out.println(x);
//        }

        System.out.println(ArrayListUtils.lengthOfTheLongestSubstring("arab"));


    }
}
