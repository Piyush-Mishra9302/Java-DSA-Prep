public class missingChar {

    public static char findMissingChar(char[] arr){

        for(int i = 0; i < arr.length ; i++){
            if(arr[i + 1] - arr[i] > 1 ){
                return (char) arr[i + 1] ;
            }
        }
        return '\0';
    }
    
    public static void main (String []args){
        char[] arr = {'p', 'q', 'r', 's', 'u'};

        char misschar = findMissingChar(arr) ;
        System.out.println(misschar);



    }
}
