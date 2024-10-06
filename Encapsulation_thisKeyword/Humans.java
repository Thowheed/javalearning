package Encapsulation_thisKeyword;

public class Humans {
    // private int age = 11;// if nothing is assigned it gives me zero
    // private String name = "Thowheed";// initial it will print null if value not
    // assigned

    // everytime u create an instance variable make it private no one should able to
    // access it

    // they should be able to access them but not directly \we may use getters
    // setters/ methods

    private int age;
    private String name;

    // creating Constuctor
    // constructor name should be same as class name
    // we can assign value inside itself when by passing value in object
    // no return type needed here

    public Humans() { // normal/parameterized constructor even if we not create it will get created
                      // automatically
        System.out.println("inside constructor");
        // this.age = age;
        // this.name = name;
        age = 2;
        name = "Arshath";
    }

    public Humans(int age, String name) { // Parameterized constructor
        System.out.println("inside constructor");
        this.age = age;
        this.name = name;
    }

    public void setAge(int num) {
        // this num is a local variable
        // age variable is instance variable
        age = num;

        // after this see name eg.
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Humans object) {
        // here we have name as local and instance variable
        name = name;// this will give null because the local variable setting value for itself. so
                    // it is still null
        Humans obj = new Humans(20, "Thowheed");
        obj.name = name; // this is one method
        // but this again gives 0 only. This creates another object which is does not
        // set value to that object.

        // so what we can do is we can send the object as parameter
        Humans obj1 = object;
        obj.name = obj1.name; // this will work

        this.name = name; // instead creating an in another class and giving that object as parameter
                          // itself is not correct way
        // because gives "this" key word where
        // this points to current object which currectly calling the method.
        // simply it reperesents current object itself.
    }
}
