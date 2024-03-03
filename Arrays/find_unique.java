package Arrays;

public class find_unique {
    
    // This is not the best possible solution, we can have more optimised solutions.

    public static int findUnique(int arr[]){
        // Outer Loop
        for(int i=0; i<arr.length; i++){
            int j;
            for( j=0; j<arr.length; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
            }
            if(j == arr.length){
                return arr[i];
            }
        }

        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        
        int arr[] = {2, 6, 8, 5, 6, 2, 8};
        int ans = findUnique(arr);
        System.out.println(ans);
    }
}
