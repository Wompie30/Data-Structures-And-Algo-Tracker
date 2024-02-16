package Arrays;
import java.util.*;

public class findLargest {
    
    // Write code to creat an array from inputs that are given by user
    // and print the largest prensent in the Array


    // Function to print the largest present in an array
    public static int getLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int size = arr.length;
        for(int i=0; i<size; i++){
            if (max <= arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    // Function For Creating an Array from user input
    public static int[] input(){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int[size];

        for(int i=0; i<size; i++){
            input[i] = sc.nextInt();
        }

        return input;
    }

    // Function to print an array
    public static void printArray(int arr[]){
        int size = arr.length;
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = input();
        printArray(arr);
        System.out.println("The Largest in the Array defined by user is: " + getLargest(arr));
    }
}
