package Inheritance;

class Calc {// after adv extends now this is accessible using AdvCalc object
    // this is a super class
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc { // now this is accessible using AdvCalc object
    // this is a sub-class
    // this is called single level inheritance
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc { // this is called multiple hierarchy or multilevel inheritance
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Demo {
    public static void main(String[] args) {
        // Calc r1 = new Calc();

        // AdvCalc r1 = new AdvCalc();
        VeryAdvCalc r1 = new VeryAdvCalc();

        int n1 = r1.add(3, 5);

        System.out.println("n1====>" + n1);

        int n2 = r1.sub(7, 1);

        System.out.println("n2==>" + n2);

        int div = r1.division(4, 2); // but this is not possible if u need we should inherit this as child class to
        // calc

        System.out.println("div===>" + div);

        int p = (int) r1.power(5, 2);

        System.out.println("p=====>" + p);
    }

}
