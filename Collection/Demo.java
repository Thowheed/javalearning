import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    // Collection is a interface 
    public static void main(String[] args) {
        Collection nums = new ArrayList(); 
        nums.add(6);
        nums.add(8);
        nums.add(2);
        nums.add("55"); //this gives run time error without mentiontion type if we mention it will gie compile time error


        System.out.println(nums);

        //to print one by one

        for(Object num: nums){
            System.out.println(num);
        }


        // to avoid object we need to mention <>
        Collection<Integer> num1 = new ArrayList<Integer>();
        
        num1.add(6);
        num1.add(8);
        num1.add(2);

        System.out.println(num1);
        for(int num: num1){
            System.out.println(num);
        }

        List<Integer> num2 = new ArrayList<Integer>();
        num2.add(6);
        num2.add(8);
        num2.add(2);

        System.out.println(num2.get(0));// we can access it with index only if we mention List
        System.out.println("indexOf"+" "+num2.indexOf(6));
    }
}