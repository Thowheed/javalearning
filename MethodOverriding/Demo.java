package MethodOverriding;

class A {
    public void show() {
        System.out.println("Inside A show");
    }

    public void config() {
        System.out.println("Inside A config");
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class B extends A {
    public void show() { // this methods overrides the method of A and this is printed
        System.out.println("Inside B show");
    }

    public int add(int n1, int n2) {// this methods overrides the method of A and this is printed
        return n1 + n2 + 1; // this will have different behaviour
    }
}

public class Demo {
    
    public static void main(String[] args) {
        // A val = new A();

        B val = new B();
        val.show();
        val.config();
        // System.out.println();
    }

}
