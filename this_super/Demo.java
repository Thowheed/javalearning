package this_super;

class A extends Object {
    public A() {
        super();
        System.out.println("Inisde A constructor");
        // here i have given super method for A
        // but what it extends.
        // every class in java extends the object class
        // so basically we are calling "constructor" of the object class
    }

    public A(int num) {
        super();
        System.out.println("inside a int constructor");
    }
}

class B extends A {
    public B() {
        super();// whether u mention or not it will be there and it will call the parent class
        // super means call the constructor of the super class so only the super class
        // constructor is called first and then only next line is printed, it calls the
        // default one
        System.out.println("inside B Constructor");
    }

    public B(int num) {
        // super();// whether u mention or not it will be there and it will call the
        // parent class
        // and every constructor has it.

        // super(num); // this calls a parameterized consturctor
        this();
        System.out.println("inside B int");
    }

    public void show() {
        System.out.println("Inside show");
    }
}

public class Demo {
    public static void main(String[] args) {
        B objB = new B(); // without creating object for a it will execute the constuctor of A too.
        // this is because whenever u create object for a class it will call subclass
        // and superclass constructors

        B objB1 = new B(1);

        // B obj;  
        new B().show(); // this creates object

    }

    // with only one object i Want to execute both constructor of b and default
    // constructor of a and is it possible.
    // it is possible
    // this() it will execute the constructor of the same class
}

// why a sub class is calling the constructor of parent class?
// every constructor in java has a method called super() whether u mention or
// not so even if you not mention super it will be there and it will call the
// parent class constructor, so every constructor has it.

// Naming convention

// class and Interface - Calc, Runnable.
// variable and method - marks, show()
// constants - BRAND // all capital