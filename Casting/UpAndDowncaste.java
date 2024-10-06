package Casting;

class A {
    public void show1() {
        System.out.println("Inside show A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("Inside show b ");
    }
}

public class UpAndDowncaste {
    public static void main(String[] args) {

        double d = 4.5;

        // int i = d; this gives error

        int i = (int) d; // down casting

        System.out.println(i); // output 4

        A obj = new A();

        obj.show1();

        // obj.show2(); this is not possible..

        // A obj = new B(); // we have done this in dynamic dispatch

        A objUpcasted = (A) new B(); // here we don't need to mention(A) it normally works

        objUpcasted.show1();// this is called upcasting

        B objDownCasted = (B) new A();

        objDownCasted.show2(); // downcasting
        objDownCasted.show1();
        // we have accessed parent and child both
    }
}
