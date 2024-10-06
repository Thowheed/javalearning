class Calculator {

    int num = 12;
    // we can have same name of pparameter but it should have different parameters

    // this is called method overloading
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) { // double + int gives double
        return n1 + n2;
    }
}

public class MethodCalcOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();
        System.out.println(calc.add(10, 10));
        System.out.println(calc.add(10, 10, 30));
        System.out.println(calc.add(10.10, 10));

        System.out.println(calc.num);
        System.out.println(calc1.num);
        // what if before printing if I chage the value it will change only calc.num
        // value but we will get same value if we get it with
        // calc1.num

        calc.num = 25;

        System.out.println(calc.num);
        System.out.println(calc1.num);

    }
}
