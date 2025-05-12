
import java.util.*;

public class BreakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Programe for if entered number is a multiple of 10 then exit the programe

        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();

            if(n % 10 != 0){
                System.out.println(n);
            }else{
                break;
            }
        } while(true);
        sc.close();
        
    }
}
