package Interface;

// abstract class Computer {
// instead of abstract we can also use interface 
interface Computer {
    // public void code() {

    // } so we are not using it here so we can make it abstract
    // public abstract void code();

    void code();
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
        System.out.println("coding...");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code, compile and run,laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, compile and run,desktop");
    }
}

public class Demo2 {
    public static void main(String[] args) {

        // developer needs laptop but some company gives desktop or laptop so we can't
        // pass laptop obj for developer so this is called tight coupling it means
        // developer depends on laptop

        // Laptop lap = new Laptop(); so instead of this we have computer class and
        // parent class will be computer for both
        // Desktop desk = new Desktop();

        // we cannot create object for computer if it is abstract
        // Computer com = new Computer();

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer thow = new Developer();

        // we are passing lap first as object
        thow.devApp(lap);
        // dev need laptop or maybe a pc will be provided
        // so when

        thow.devApp(desk);
        // this is called loosely coupled
    }
}
