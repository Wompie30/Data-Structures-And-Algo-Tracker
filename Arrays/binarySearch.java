package Arrays;

public class binarySearch {
    
    // Write code for binary search in java.

    public static int binSearch(int arr[], int key){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int ans = binSearch(arr, key);
        System.out.println(ans);
    }
}
