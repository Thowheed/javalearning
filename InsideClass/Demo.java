package InsideClass;

class A {
    int age;

    public void show() {
        System.out.println("In show");
    }

    // static class B { // we can use static only for inner class
    class B {
        public void config() {
            System.out.println("Inside config");
        }
    }
}

abstract class C {
    public abstract void show1();

}

class D extends C {
    @Override
    public void show1() {
        System.out.println("Inside show 1");
    }

}

public class Demo { // if we compile we get two classes A and B but B will be like A$B which means B
                    // belongs to A
    public static void main(String[] args) {
        A obj = new A() {

            @Override // inner or anonymous class and this will create a class for Demo$1.class when
                      // we compile for multiple class this will increase 1 or 2 or 3
            public void show() {
                System.out.println("Inside anonymous class show");
            }
        };

        obj.show();
        // obj.config(); this gives error

        // cannot create obj for inner class B

        A.B obj1 = obj.new B(); // this is how we can create obj for inner class

        obj1.config();

        // A.B obj1 = new A.B(); // this for static class

        // if we make inner class static we can access it directly through A

        // anonymous class

        // instead of creating another class outside A and inheriting it and overriding
        // a method
        // we can use this

        D objD = new D() {
            public void show1() {
                System.out.println("inside D show 2");
            }
        };

        objD.show1();

    }
}
