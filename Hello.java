class Hello {
    public static void main(String[] args) {
        System.out.println("hi everyone");

        int num = 9;
        // byte by = 129; gives error

        byte by1 = 127;

        // literals
        int a = 0b101;

        System.out.println(a);

        // zero counting easy way to readable

        int numCount = 50_00_000; // 5000000

        System.out.println("numCOunt" + numCount);

        // double db = 56; //56.0
        double db = 12e10; // 1.2E11
        System.out.println(db);

        // character
        char ch = 'a';
        ch++;// b
        System.out.println(ch);
    }
}