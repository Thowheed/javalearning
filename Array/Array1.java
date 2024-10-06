package Array;

// import java.lang.reflect.Array;

public class Array1 {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 2, 4 };

        System.out.println(arr);

        int arr1[] = new int[5];

        arr1[0] = 1;
        arr1[1] = 2;

        // System.out.println(arr1[3]);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.println(arr1[i]);
        }

    }
}
