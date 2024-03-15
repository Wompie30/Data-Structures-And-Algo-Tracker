package Arrays;

public class revPart {
    
    // Reverse a part of array.
    // Given "N" array element and starting index and ending index, reverse the array from starting and ending index.

    public static void revPartOfArray(int[] arr, int start, int end){

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arr = {-3, 4, 2, 8, 3, 9, 6, 2, 8, 10};
        // Expected Output is - {-3, 4, 2, 2, 6, 9, 3, 8, 8, 10};
        revPartOfArray(arr, 3, 7);
        printArr(arr);
    }
}
