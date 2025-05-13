import java.util.*;


public class Palindrome{

    public static void checkPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;

        while(number !=0 ){
            int reminder = number % 10; //Extracting the Last digit
            reversedNumber = reversedNumber * 10 + reminder; // reversing the number
            number /= 10;
        }
        if(originalNumber == reversedNumber){
            System.out.println("The number is a Palindrome");
        } else{
            System.out.println("Number is not the palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int number = sc.nextInt();
        checkPalindrome(number);
    }
}
