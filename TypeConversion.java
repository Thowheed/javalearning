public class TypeConversion {
    // we always don't need to javac TypeConversion.java and java TypeConversion
    // instead of this we can give cmd java TypeConversion.java as a single command
    public static void main(String[] args) {
        byte max = 127;
        int a = max;

        // max=a; this doesn't work, this is called narrowing

        // a = max;

        // this will work, this is called widening

        int b = 12;

        // eventhough now you cannot narrowing

        max = (byte) a; // this is called casting

        // if we have value b = 257 and try to convert it into byte it will make use of
        // modulus operator it will 257%256 gives 1 and prints 1

        byte by3 = 127;
        System.out.println(by3);
        int num = by3;
        System.out.println(num);

        // eg 2

        int k = 257;
        System.out.println("k" + k);
        // byte by4 = k; this will give error
        byte by4 = (byte) k;

        System.out.println(by4); // output: 1 257%256

        float f = 2.5f;
        int t = (int) f; // output: 2

        System.out.println("t==>" + t);

        byte num6 = 10;
        byte num7 = 20;

        int number = num6 * num7; // this is called type promotion
        System.out.println(number);
    }

}
