package Arrays;

public class reverse {

    // Write the code for reversing the array.


    // Function for reversing the array.
    public static void reversedArr(int[] arr){
        
        int start = 0;
        int end = arr.length-1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        // Time Complexity - O(n)
        // Space Complexity - O(1)
    }


    // Function for printing the array.
    public static void printArr(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        reversedArr(arr);
        printArr(arr);
    }
}
