package Arrays;

import java.util.Scanner;

// Write the code to arrange numbers in an array in following order
// example - 
// if array size is 5 then the array will be {1,3.5,4,2};
// if array size is 6 then the array will be {1,3,5,6,4,2};


public class arrangeNums {
    

    public static int[] arrangeNumbers(){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        int start = 0;
        int end = arr.length-1;
        int counter = 1;

        while(start <= end){

            if(counter%2 == 1){
                arr[start] = counter;
                counter++;
                start++;
            } else {
                arr[end] = counter;
                counter++;
                end--;
            }
        }

        return arr;
    }

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int ans[] = arrangeNumbers();
        printArray(ans);
    }
}
