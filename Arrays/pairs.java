package Arrays;

public class pairs {
    

    // Write the code to print the possible pairs present in an array.
    public static void printPairs(int arr[]){

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {2, 4, 6, 8, 10};
        printPairs(arr);
    }
}