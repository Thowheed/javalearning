package Static;

public class Eg1 {
    // basically static means a class member not an object member

    // Important

    // what if we take static from main method..

    // so if we take static we need to create object for Eg1.
    // but the starting execution line is main method so without executing main
    // method how to call with object
    // so to solve it we need main method with static.
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        Mobile obj1 = new Mobile();

        obj.brand = "apple";
        obj.price = 35000;
        obj.name = "SmartPhone";

        obj1.brand = "Samsung";
        obj1.price = 35000;
        obj1.name = "SmartPhone"; // even after commenting the obj1 output will give
        // smartPhone as name

        obj.show();
        obj1.show();

        Mobile.show1(obj);
        // static method can be directly called by class name.

        // if we don't create object it won't load MOBILE class as well

        // for that we have spl class called "Class".
        try {
            Class.forName("Static.Mobile");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // when we use method it throw an exception

        // this will load name
    }
}
