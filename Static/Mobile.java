package Static;

public class Mobile {
    String brand;
    int price;
    static String name;

    // these variable are called instance variable

    // for static variable to be initialized only once we can have static block

    static {
        name = "Phone";
        // in static block
        System.out.println("In static block");
    } // static block only executed before constructor

    public Mobile() { // constructor
        brand = "";
        price = 0;
        // name = "Phone"; // if we are doing it here if we create multiple obj it will
        // initialize

        System.out.println("in constructor");
    }

    public void show() {
        // variables declared inside this is called local variable...
        System.out.println(brand + " " + " price " + price + " " + name + "name");
    }

    public static void show1(Mobile obj) {
        System.out.println("inside static method");

        // System.out.println(brand + " " + " price " + price + " " + name + "name");

        // we cannot use non-static variable inside static method..
        // this is because there will be confusion which object should assign when we
        // call it with class name.

        // so directly is not possible bu indirectly possible by passing object itself
        // refer below eg.

        System.out.println(obj.brand + " " + " price " + obj.price + " " + name + "name");

    }

}

// so basically we have two object it occupies two space in heap

// so we are keepig static for name and name will be common.

// if we try to change the name with any obj1 or 2 it will affect all the
// values.
