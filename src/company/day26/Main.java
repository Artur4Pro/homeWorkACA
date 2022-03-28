package company.day26;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("q");
        list.add("☺");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
//
//        Methods.printElements(list);
//        Methods.printElements(list1);

        Integer[] array = new Integer[]{1, 2, 3, 4};
        String[] strings = new String[]{"aaa", "bbb", "ggg"};
//
//        System.out.println(Methods.convertToList(array));
//        System.out.println(Methods.convertToList(strings));

        System.out.println(Methods.maxValue(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }));

        System.out.println(Methods.maxValue(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }));


        DefaultPair<Integer, Integer> defaultPair = new DefaultPair<>(new Integer(15), 10);
        System.out.println(defaultPair.getKey());
        System.out.println(defaultPair.getValue());

    }
}
