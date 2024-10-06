package Abstract;

abstract class Car { // we can have abstract method only in abstarct class
    // but normal can be created here
    public abstract void Drive(); // creating but not implementing it, we will declare it.

    public abstract void fly(); // but if we declare here and it becomes compulsary to use it in the class which
    // inherits this else it gives error.

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class WagonR extends Car {
    public void Drive() { // this method overrides it
        System.out.println("Driving car"); // implemeting it here
    }

    public void Drive1() {
        System.out.println("Driving car"); // implemeting it here
    }

    public void fly() {
        System.out.println("Flying car");
    }

    // but after declaring u don't want to use every method we
    // change this class to abstarct class too but we can't create object for it and
    // we need to create
    // another calss and we need to inherit as well
}

public class Demo {
    public static void main(String[] args) {

        // Car obj = new Car(); we cannot create an object for abstract class

        // obj.Drive();
        // obj.playMusic();

        WagonR obj = new WagonR();

        obj.Drive();
        // this calls Drive of wagonR

        obj.Drive1();
    }
}
