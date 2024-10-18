package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> num3 = Arrays.asList(4, 5, 7, 3, 2, 6);
        // System.out.println(num3);

        int sum = 0;
        for (int n : num3) {
            if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;

            }
        }

        // System.out.println(sum);

        for (int i = 0; i < num3.size(); i++) {
            // System.out.println(num3.get(i));
        }

        // for each belongs to list interface

        // num3.forEach(n -> System.out.println(n));

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n) {
                // System.out.println(n);
            }
        };
        // for each only accepts Consumer which is a functional interface which
        // only has accept function which is void

        // num3.forEach(con);

        // Coming to Stream

        Stream<Integer> st = num3.stream();

        // now if we change any value in stream it doesn't affect the num3
        // System.out.println(st);

        // st.forEach(n -> System.out.println(n));
        // st.forEach(n -> System.out.println(n));

        // we cannot use second time stream, this will error in run time

        // beneift

        // we have lot of methods to work with

        // like

        Stream<Integer> s2 = st.filter(n -> n % 2 == 0);
        System.out.println("Even");
        // System.out.println(s2)
        Stream<Integer> s3 = s2.map(n -> n * 2);

        // s2.forEach(n -> System.out.println(n));

        s3.forEach(n -> System.out.println(n));

        Stream<Integer> s4 = num3.stream();

        int reducedValue = s4.reduce(0, (c, e) -> c + e);
        System.out.println("reducedValue===> " + reducedValue);

        int result = num3.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println("result===>  " + result);

        Stream<Integer> sorted = num3.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sorted.forEach(n -> System.out.println(n));

        // there another one called parallelStream() which we involves multiple threads
        // but don't use it with sort.

    }
}
