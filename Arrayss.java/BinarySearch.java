public class BinarySearch {

    // public static int getBinarySearch(int numbers[], int key){
    //     int start = 0; int end = numbers.length-1;

    //     while(start <= end){
    //         int mid = (start + end) / 2;

    //         //compairison
    //         if(numbers[mid] == key){
    //             return mid;
    //         }
    //         if(numbers[mid] < key){
    //             start = mid + 1 ;
    //         }else{
    //             end = mid -1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String [] args){
    //     int number[] = {2,4,6,8,10,12,14,16,18};
    //     int key = 18;
    //     System.out.println("Index for the key is : " + getBinarySearch(number, key));
   // } 
   public static int binarySearch(int numbers[], int key){
    int start = 0; int end = numbers.length-1;
    
    while(start <= end){
        int mid = (start + end) / 2;
        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] < key){
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
        return -1;
   }
   public static void main(String args[]){
    int number[] = {2,4,6,8,10,12,14,16,18};
    int key = 14;
    System.out.println("Index for the key is : " + binarySearch(number, key));
   }
}
