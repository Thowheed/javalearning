package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return name+" :  "+age;
    }
     // if we didn't override this will be output
    //[Comparator.Student@2d363fb3, Comparator.Student@7d6f77cc, Comparator.Student@5aaa6d82, Comparator.Student@73a28541]

    @Override
    public int compareTo(Student that){
       if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Demo{
    public static void main(String[] args) {

        // Comparator<Student> com = new Comparator<Student>(){
        //     public int compare(Student i, Student j){
        //         if(i.age > j.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        Comparator<Student> com = (i,j) -> i.age >j.age ? 1: -1;
            // if(i.age > j.age)
            //     return 1;
            // else
            //     return -1;
        
    // };
        
        List<Student> data = new ArrayList<>();

        data.add(new Student(23,"Thowheed"));
        data.add(new Student(22, "Maari"));
        data.add(new Student(17,"Arshath"));
        data.add(new Student(2, "Marziya"));

        
        Collections.sort(data,com);
        //[Marziya :  2, Arshath :  17, Maari :  22, Thowheed :  23]

        // System.out.println(data);
        for(Student s: data){
            System.out.println(s);
        }

        //without using comparator we can sort when extend our class to 
        // comparabale 

        // Collections.sort(data); // this gives error for only integers but is will give error
        // this can be solved by implementing comparable which has method comparetor

        System.out.println("comparaotr"+" "+data);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value:  ");
        int a = sc.nextInt();

        System.out.println(a);
        
        List<Integer> num3 = Arrays.asList(4,5,7,2);
        System.out.println(num3);

        int sum = 0;
        for(int n: num3){
            if(n%2 == 0){
                n=n*2;
                sum = sum+n;

            }
        }

        System.out.println(sum);

    }
}
