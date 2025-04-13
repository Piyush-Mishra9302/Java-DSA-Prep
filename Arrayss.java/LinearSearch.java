public class LinearSearch {
    
    public static int linearSearch(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 30;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not FOUND");
        }else{
            System.out.println("The key is at index : " + index);
        }
    }
    
}
