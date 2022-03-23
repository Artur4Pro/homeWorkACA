package company.day24;

import company.day23.arrayList.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class ArrayListUtils {

    public static boolean isDuplicate(ArrayList arrayList) {
        Set<Integer> set = new HashSet<>();
        for (Integer x : arrayList) {
            if (!(set.add(x))) {
                return true;
            }
        }
        return false;
    }

    public static void printUniqueElement(ArrayList arrayList) {
        Set<Integer> set = new HashSet<>();
        for (Integer x : arrayList) {
            if (!set.add(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        System.out.println(set);
    }

    public static int countOfDuplicate(ArrayList arrayList) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (Integer x : arrayList) {
            if (!set.add(x)) {
                count++;
            }
        }
        return count;
    }

    public static int firstUniqueElement(ArrayList arrayList) {
        Set<Integer> set = new HashSet<>();
        for (Integer x : arrayList) {
            if (!set.add(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        return (int) set.toArray()[0];
    }

    public static int  lengthOfTheLongestSubstring (String strings) {
        Set <Character> set = new HashSet<>();
        for (int i = 0; i < strings.length(); i++) {
            if (!(set.add(strings.charAt(i)))){
                set.remove(strings.charAt(i));
            }else {set.add(strings.charAt(i));}
        }
        return set.size();
    }

}
