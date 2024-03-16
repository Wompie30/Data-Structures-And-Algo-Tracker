package Arrays;

public class rotate {
    
    /*
        Given "N" Elements, Rotate array from last to first by "K" times 
        asked in companies like Google, Meta, Amazon

        k = 3
        arr[7] = {3, -2, 1, 4, 6, 9, 8}

        Solution - 

        after first rotation the output array is - 
            {8, 3, -2, 1, 4, 6, 9}

        after the second rotation the output array is - 
            {9, 8, 3, -2, 1, 4, 6}

        after the third rotation the output array is - 
            {6, 9, 8, 3, -2, 1, 4}
     */

     public static void reverseArr(int[] arr, int start, int end) {

        while (start <= end) {
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
        
        int[] arr = {3,-2, 1, 4, 6, 9, 8};
        int k = 3;
        reverseArr(arr, 0, 6);
        printArr(arr);
        reverseArr(arr, 0, k-1);
        printArr(arr);
        reverseArr(arr, k, arr.length-1);
        printArr(arr);
     }
}