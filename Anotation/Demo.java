package Anotation;

class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("Inside A object");
    }
}

class B extends A {

    @Override
    // public void showTheDataWhichBelongToThisClass() {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("Inside B object");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass(); // B should print since we overrid the method but it will print in A
                                                  // show
        // it is called logical problems because we missed s in naming differ from class
        // A, So using annotation throw error at compile time itself
    }
}
