package Array;

class Student {
    String name;
    int rollNo;
    int marks;
}

public class JaggedArray_Multi {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; // this is jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {// size of the row is 3 here
            for (int j = 0; j < nums[i].length; j++) { // size of the very row is shown here
                nums[i][j] = (int) (Math.random() * 10);

            }

        }

        // printing it with enhanced for loop for this we no need to mention the lenght
        // of the array
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Thow";
        s1.marks = 60;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Arsh";
        s2.marks = 70;

        Student s3 = new Student();
        s3.rollNo = 1;
        s3.name = "Hameed";
        s3.marks = 60;

        // to create array of object give that class name when declaring array type

        Student arrStudent[] = new Student[3];
        arrStudent[0] = s1;
        arrStudent[1] = s2;
        arrStudent[2] = s3;

        for (int i = 0; i < arrStudent.length; i++) {
            System.out.print(arrStudent[i]); // prints
                                             // Array.Student@3af49f1cArray.Student@19469ea2Array.Student@13221655

            System.out.println(s1.name + " " + s1.marks);

            System.out.println(arrStudent[i].name + " " + arrStudent[i].marks);
        }

        // for each or enhanced loop
        for (Student s : arrStudent) {
            System.out.println("ss" + s.name);
        }

    }

    // for three dimensional array we should have extra square bracket int
    // nums[][][] = new int[3][][];

    // int nums1[][][] = new int[][][];

}
