package Arrays;

public class largestNumber {
    
    // Find the largest in a given array.

    public static int getLargest(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 6, 3, 5};
        int ans = getLargest(arr);
        System.out.println("The largest number present in given array is " + ans);
    }
}
