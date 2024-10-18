package ExceptionHanling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class AlthowException extends Exception {
    // need to extend exception or we get error
    public AlthowException(String string) {
        super(string); // calling super class
    }
}

class A {
    public void show() {
        try {
            // Class.forName("Demo");
            Class.forName("Calc");

        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println("Class not found");
        }
    }
}

public class Demo {
    static {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) throws IOException {
        int a[] = new int[5];
        try {
            // int i = 0;
            int i = 2;
            int j = 18 / i;

            System.out.println(j);
            System.out.println(a[0]);
            System.out.println(a[5]);// out of boundary
        } catch (ArrayIndexOutOfBoundsException error) {
            // TODO: handle exception
            System.out.println("Error" + " " + error);
            // Error java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for
            // length 5
            // throw error;

        } catch (ArithmeticException error) {
            // it will print which error is thrown accordingly
            System.out.println("Arithmetic expression error");
        }
        System.out.println("After error"); // if we don't throw error this gets printed

        try {
            int i = 0;
            // int i = 2;
            int j = 18 / i;

            System.out.println(j);
        } catch (ArithmeticException error) {
            // TODO: handle exception
            System.out.println("Error" + " " + error);
        }

        System.out.println("after arithmetic exception");

        try {
            // throw

            int i = 0;
            int j = 0;
            // j = 18 / i;

            j = 18 / i;

            if (j == 0)
                throw new ArithmeticException();

            // here we throw error the catch catches the error

        } catch (Exception e) {
            // TODO: handle exception
            // j = 18 / 1;
            System.out.println("Thats default output");

        }
        // System.out.println(j);
        System.out.println("Byee....");

        // going to create new exception

        try {
            int i = 20;
            int j = 0;
            // j = 18 / i;

            j = 18 / i;

            if (j == 0)
                throw new AlthowException("Throw my exception..");

        } catch (AlthowException e) {
            // TODO: handle exception
            System.out.println("Default exception" + " " + e);
        }

        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println("Exception" + " " + e);
        }

        A obj = new A();
        obj.show(); // if we didn't handle exception it will show error here

        // interview question

        // println() which class

        System.out.println();

        // println is inside PrinstStream class
        // out is the object of println, it is a static variable inside System class

        // scanner class

        try {
            System.out.println("Enter a number..");
            int num = System.in.read();
            System.out.println(num); // input 5 and gives 53
            // it gives a ascii value`

            System.out.println(num - 48); // we can solve this by this

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // readLine reads only string
        // int nume = Integer.parseInt(bf.readLine());

        // System.out.println(nume);

        // bf.close();
        // before 1.5 where using buffer reader

        // Enter number for scanner class
        System.out.println("enter number for scanner class..");
        Scanner sc = new Scanner(System.in);

        // sc.nextLine() for string;

        // sc.nextInt(); for integer

        int num1 = sc.nextInt();

        System.out.println(num1);

        // try can be used with finally
        // even without catch finally can be used

        // finally tag can be used for closing the db connection and bufferclasss and so
        // on

        int num3 = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // if we give this it will close automatically because it is autoclossable
            num3 = Integer.parseInt(br.readLine());

            System.out.println(num3);
        }
    }
}
