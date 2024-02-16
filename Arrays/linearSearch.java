package Arrays;

// Write the code for linear search.

public class linearSearch {
    
    public static int linSearch(int arr[], int key){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {8,10,4,1,15,9};
        int key = 15;
        
        System.out.println(linSearch(arr, key));
    }
}
