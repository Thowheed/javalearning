package FunctionalInterface;

@FunctionalInterface
interface A {
    void show(int i);
    // void run(); since we have mentioned functional interface we cannot have
    // another one method only one mehtod allowed

}// so this is called single abstract method interface or functional interface to
 // tell that we can have anotation
 // functional interface.

class B implements A {
    @Override
    public void show(int i) {
        System.out.println("Inside show");
    }
}

public class Demo {
    public static void main(String[] args) {

        // A obj = new A(); we can create instance

        A obj = new B();

        obj.show(5);

        B obj1 = new B();

        obj1.show(4);

        // else

        A obj3 = new A() {
            public void show(int i) {
                System.out.println("Inside obj3 show");
            }
        };

        obj3.show(3);

        // instead of this we can use a lambda expression

        A obj4 = (i) -> {
            System.out.println("Inside obj 4" + i);

        };// this works we don't need to mention type

        // else

        // A obj5 = (int i) -> System.out.println("Inside obj 4" + i);// this works

        A obj5 = i -> System.out.println("Inside obj 4" + i);// this works

        obj4.show(4);

    }
}
