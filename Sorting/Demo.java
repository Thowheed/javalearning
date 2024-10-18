package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            // inside comparator we have compare
            public int compare(Integer i, Integer j) { // we should use class name and not int. Becasue it works with
                                                       // wrapper classes
                if (i % 10 > j % 10) {
                    return 1; // if we return 1 it swaps for -1 it doesn't
                } else {
                    return -1;
                }
            }
        };

        List<Integer> num = new ArrayList<Integer>();
        num.add(43);
        num.add(31);
        num.add(72);
        num.add(29);

        // Collections.sort(num);

        // if we want to sort it by our own logic we should use comparator

        Collections.sort(num, com); // [31, 72, 43, 29]
        // this is how we specify our logic

        System.out.println(num);
    }
}
