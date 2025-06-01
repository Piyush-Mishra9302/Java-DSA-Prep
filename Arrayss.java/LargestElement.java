public class LargestElement{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        
        
      
       int mostLarge = returnLargest(arr);
       System.out.println(mostLarge);
    }
     public static int returnLargest ( int []arr){
        int largest = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
       }

}