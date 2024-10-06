package Polymorphism;

class Computer {

}

class Laptop extends Computer {

}

class A {
    public void show() {
        System.out.println("Inside A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("Inside B show");
    }
}

class C extends B {
    public void show() {
        System.out.println("Inside C show");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();

        // refering object of B in A

        A obj1 = new B();

        obj1.show();

        // here we are creaing reference of Computer to laptop object
        // we can say laptop also computer

        Computer comObj = new Laptop(); // this is just eg to under stand

        // Start from here to understand further

        A objA = new A();

        objA.show(); // Inside A show

        objA = new B(); // refer not to understand stack and heap

        objA.show(); // Inside B show

        objA = new C();

        objA.show(); // Inside C show

        // this is called runtime polymorphism (late binding);

        // all this methods are called dynammic method dispatch
    }
}
