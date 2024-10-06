package String;

public class String1 {
    public static void main(String[] args) {
        String str = new String();

        System.out.println(str); // prints nothing

        String name = new String("Thowheed");

        System.out.println(name);

        System.out.println(name.hashCode()); // prints memeory 1469215704

        System.out.println("index:  " + name.charAt(1)); // at index 1 we have h

        // before printing if we append something what will happen

        name += " Ahmed";

        System.out.println("name after appending" + name);
        System.out.println(name.hashCode()); // stores it in differenct memory in heap 726804957

        String s1 = "thowheed";
        String s2 = "thowheed";

        // here we have two references and only one object is created in stack we have
        // s1 and s2

        System.out.println(s1 == s2); // true

        // we have special area in heap called string constant pool; constant means if
        // we create something we can't change

        // so for name variable we have Thowheed at 101 memory in string pool

        // after that we have s1 it checks for it in string pool and since it is not
        // there it will create thowheed at 102

        // after that s2 is created in stack and it chekcs for thowheed at string pool
        // and since we have it will point to address 102

        // so in line 19 what happens is that it creates another object in string pool
        // and creates sepearate memory at 103

        // so after that it is eligible for garbage collector and after some time it
        // will be removed thats we manage space

        // if we want muttable string we have StringBuffer and StringBuilder both are
        // similar and have one difference

    }
}
