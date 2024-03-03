package Arrays;

public class intersectionProblem {
    
    public static void getIntersection(int arr1[], int arr2[]){

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr1[] = {6, 1, 2, 4, 9, 0};
        int arr2[] = {2, 5, 3, 6, 9, 10, 15};
        getIntersection(arr1, arr2);
    }
}
