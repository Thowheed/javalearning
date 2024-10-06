package Interface;

interface A {

    // every varable inside interface are final and static so we should give value
    // while declaring itself
    int age = 23;

    String name = "thow";

    void show();

    void config();
}

interface X {
    void run();

}

interface Y extends X { // interface inherits interface we will extend

}

class B implements A, X {
    public void show() {
        System.out.println("Inisde A show");
    }

    public void config() {
        System.out.println("Inisde config");
    }

    public void run() {
        System.out.println("Iam running");
    }
}

public class Demo {
    public static void main(String[] args) {
        // if we are going to have only abstract methods we can go for interface

        A obj = new B();

        obj.config();

        obj.show();

        System.out.println(A.age);

        // obj.run(); this is not possible

        // B obj1 = (B) new A(); this gives errror

        X ob1 = new B();
        ob1.run();

        // ob1.show() so we can't call other two methods
    }
}
