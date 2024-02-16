package Arrays;

// Write the code for swapping alternate elements in an array.
// Check the condition for both the even size and odd size array

public class alternateSwap {
    
    // Function to swap the alternate elements for both odd and even cases
    public static void swapAlternate(int arr[]){

        for(int i=0; i<(arr.length-1); i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    // Function to print an array.
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = {2,1,9,3,10,15};
        swapAlternate(arr);
        printArray(arr);
    }
}
