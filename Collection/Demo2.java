import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        // only sets unique value
        // it is in random order
        Set<Integer> num = new HashSet<Integer>();

        num.add(1);
        num.add(2);
        num.add(1);
        num.add(28);
        num.add(14);
        num.add(63);

        System.out.println(num);


        // tree set will be sorted
        Set<Integer> num2 = new TreeSet<Integer>();

        num2.add(1);
        num2.add(2);
        num2.add(1);
        num2.add(28);
        num2.add(14);
        num2.add(63);

        System.out.println(num2);

        Iterator<Integer> values = num2.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
