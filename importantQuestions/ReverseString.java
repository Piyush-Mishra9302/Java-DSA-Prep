import java.util.*;

public class ReverseString {

    public static void reverseAString(String str){

       
        String ReversedString = "";

        for(int i = str.length()-1; i >= 0; i--){
            ReversedString += str.charAt(i);
        }
        System.out.println(ReversedString);
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String OriginalString = sc.nextLine();
        reverseAString(OriginalString);
    }
}
