package company.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Methods  {


    /**
     * 1. Write a method which takes a list of any type and prints the elements of the list.
     */
    public static <T> void printElements(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }


    /**
     * 2. Write a method that takes an array of T type and converts it to a list of type T.
     */
    public static <T> List<T> convertToList(T[] array) {
        List<T> list = new ArrayList<>();
        //version 1)
//        for (T t: array) {
//            list.add(t);
//        }
        //version 2)
//        list.addAll(List.of(array));
//        return list;

        //version 3)
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * 3. Write a method which takes a List of T type and Comparator of type T. Return the largest value in the list.
     * @param list
     * @param comparator
     */
    public static <T> T maxValue(List <T> list, Comparator<T> comparator) {
        T max = list.get(0) ;
        for (T t : list) {
            if (comparator.compare(max,t)<0){
                max=t;
            }
        }
        return max;
    }



}


