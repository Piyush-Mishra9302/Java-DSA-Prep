import java.util.*;

public class LargestInArray {

     public static int getLargest(int number[]){
     int largest = Integer.MIN_VALUE;

     for (int i = 0; i < number.length; i++){
        if(largest < number[i]){
            largest = number[i];
        }
     }
     return largest;

     }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Largest in the array is : "+ getLargest(numbers));
    }
}
