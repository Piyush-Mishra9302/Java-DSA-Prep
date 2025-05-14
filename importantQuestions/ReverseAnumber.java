
public class ReverseAnumber {
    public static void main(String[] args) {
        int num = 12345;
        
    //    while(num > 0){
    //     int lastDigit = num % 10;

    //     System.out.print(lastDigit + " ");

    //     num /= 10;

    //    }
    //=========================

    //Another method

    int rev = 0;

    while(num > 0){
        int lastDigit = num % 10;
         rev = (rev * 10) + lastDigit ; 
         num = num / 10;
    }
    System.out.println(rev);
        
    }
}
