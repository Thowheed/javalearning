package Threads;

// class A extends Thread {
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // after printing first hi it the A thread will go into wait stage for 10
            // millisecond
        }

        // what happens when we need to extend another class
        // So there is another interface where Thread is implementing Runnable so we can
        // implement Runnable instead of extending
        // it with class
    }
}

// class B extends Thread {
class B implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {

        A obj1 = new A();

        B obj2 = new B();

        // obj1.show();// first hi 10 time prints after full execution it goes to next
        // line
        // obj2.show();

        // System.out.println(obj1.getPriority()); 5
        // System.out.println(obj2.getPriority()); 5

        // 1 - 10 range
        // 1 - least
        // 10 - highest
        // 5 - default priority

        // we can also set priority

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.setPriority(Thread.MIN_PRIORITY);
        // obj1.setPriority(Thread.NORM_PRIORITY);

        // obj1.setPriority(8);
        // obj2.setPriority(2); we can use it when it is needed

        // obj1.start();
        // obj2.start();

        // every start calls a run method

        // when tasks are high when i gave 100 it run simulatenously

        // scheduler concept

        // when we implement runnable we can't use our object to call start
        // for that we should call reference of interface and object of the class

        Runnable obj3 = new A();
        Runnable obj4 = new B();

        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);

        // we send object so we create link to run

        t1.start();
        t2.start();

        // we can create an anonymous function too

        Runnable obj5 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello Tthird");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t3 = new Thread(obj5);

        t3.start();
    }
}
