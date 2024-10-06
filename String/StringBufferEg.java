package String;

public class StringBufferEg {
    public static void main(String[] args) {

        // string buffer is thread safe
        // string builder isn't thread safe
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// it gives me 16 space initially for empty

        StringBuffer sb1 = new StringBuffer("Thowheed");

        System.out.println(sb1.capacity());// the capacity increases because it store my name and gives me 16 space
        // extra because it consumes continous memory location, so in that case it has
        // to relocate so to reduce relocation it gives a bufffer

        System.out.println(sb1.length());

        sb1.append(" Ahmed");
        System.out.println("name" + sb1);

        // we can also delete at charAt

        sb1.deleteCharAt(2); // o is deleted
        // System.out.println();

        String sb2 = sb1.toString();

        System.out.println("Converted into string" + sb2);

        // we can also insert in string buffer

        sb1.insert(0, "Java");

        System.out.println("insert" + sb1); // inserts jaava at 0 index

        // we can aslo set length and the others will be null when we not given
        // anything.

        sb1.setLength(30);

        // we can give capacity

        sb1.ensureCapacity(100);
        // minimum capacity will be 100

        // we can also get substring

        System.out.println(sb1.substring(0, 5));

    }
}
