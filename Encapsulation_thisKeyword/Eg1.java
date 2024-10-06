package Encapsulation_thisKeyword;

public class Eg1 {
    public static void main(String[] args) {
        Humans humanObj = new Humans(20, "Thowheed");
        Humans humans1 = new Humans();

        // humanObj.age = 20;
        // humanObj.name = "Thowheed";
        // this is not possible when we use private

        humanObj.setAge(20);
        humanObj.getAge();
        humanObj.setName("Thowheed", humanObj);
        System.out.println(humanObj.getAge());
        System.out.println(humanObj.getName());

        System.out.println(humans1.getAge());
        System.out.println(humans1.getName());
    }
}
