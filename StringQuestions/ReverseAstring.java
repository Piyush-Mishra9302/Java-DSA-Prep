

public class ReverseAstring {
    public static void main (String[]args){

        //Strings are immutable so we can't use reverse method with it but in the case of BufferString class we can use the reverse method because BufferString is mutable


        //Using for loop
        
        // String str = "VASHU";
        // String rev = "";

        // for (int i = str.length()-1 ; i>=0 ; i--){
        //     rev = rev + str.charAt(i);
        // }
        // System.out.println(rev);
        //----------------------------------------------------

        //Practice Again

        String str = "VASHU MISHRA";
        // String rev = "";

        // for(int i = str.length()-1; i >= 0 ; i--){
        //     rev = rev + str.charAt(i);
        // }
        // System.out.println(rev);
        //-------------------------------------------

        //By using StringBuffer class

        // StringBuffer sf = new StringBuffer(str);
        // System.out.println(sf.reverse());
        //-----------------------------

        //Practice againg for StringBuffer class

        StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());

    }
}    