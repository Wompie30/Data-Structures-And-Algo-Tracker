package Arrays;

public class findDuplicate {
    
    public static int getDuplicate(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }

        // In case the duplicate is not present in the problem the line 9 will never execute so as our 
        // function is of int type we have to return some int value
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        
        int arr[] = {2, 1, 0, 4, 3, 4};
        int ans = getDuplicate(arr);
        System.out.println(ans);
    }
}
