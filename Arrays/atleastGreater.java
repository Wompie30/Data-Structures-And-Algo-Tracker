package Arrays;

public class atleastGreater {
    
    /*
        Given "N" array elements, Count total number of Elements having atleast 1 element greater than itself.
    */

    public static int atlGreater(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count = 0; // Counting how many times the max element is occured in the given array.
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                count++;
            }
        }

        int ans = arr.length - count;
        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr = {-4, -3, 7, 9, 3, 9, 4};
        int ans = atlGreater(arr);
        System.out.println(ans);
    }
}
