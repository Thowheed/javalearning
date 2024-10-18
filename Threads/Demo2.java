package Threads;

class Counter {
    int count;

    // public void increment() {
    // since we didn't use synchronized at frst it made an issue that t5 and t6
    // calls it at same time and we miss many values due to that if we use
    // synchronized only t5 works with increment and then t6 has to wait for calls
    public synchronized void increment() {
        count++;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        // Runnable obj3 = new A();
        // Runnable obj4 = new B();

        // Thread t1 = new Thread(obj3);
        // Thread t2 = new Thread(obj4);

        // we send object so we create link to run

        // t1.start();
        // t2.start();

        // we can create an anonymous function too
        Counter c = new Counter();

        Runnable obj5 = () -> {
            for (int i = 0; i < 1000; i++) {
                // System.out.println("Hello Tthird");
                c.increment();
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // // TODO Auto-generated catch block
                // e.printStackTrace();
                // }
            }
        };

        Runnable obj6 = () -> {
            for (int i = 0; i < 1000; i++) {
                // System.out.println("Hello Fourth");
                c.increment();
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // // TODO Auto-generated catch block
                // e.printStackTrace();
                // }
            }
        };

        Thread t3 = new Thread(obj5);
        Thread t4 = new Thread(obj6);

        t3.start();
        t4.start();

        try {
            t3.join(); // without joining we are getting 0 as output
            t4.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(c.count); // even after adding join we are getting different output
    }
}

// Thread states

// 1. New
// 2. Runnable
// 3. Running
// 4. Waiting
// 5. Dead
