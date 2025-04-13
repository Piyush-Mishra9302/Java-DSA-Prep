import java.util.*;

public class ArraysBasics{
    public static void main(String [] args){
        //  //Array creation -- 1
        // int arr[] = new int[10];

        // //Array creation --> 2
        // int numbers [] = {1, 2, 3, 4, 5};       

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // taking inputs
        System.out.println("Enter the marks of physics");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks of chemitry");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks of maths");
        marks[2] = sc.nextInt();

        //Printing all the marks

        System.out.println("Marks of physics " + marks[0]);
        System.out.println("Marks of Chemistry " + marks[1]);
        System.out.println("Marks of Mathematics " + marks[2]);

        int percentage = (marks[0] + marks[1]+ marks[2]) / 3;
        System.out.println("Percentage is : " + percentage );
        sc.close();


    }
}