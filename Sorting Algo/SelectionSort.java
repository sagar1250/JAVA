import java.util.*;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int leastValueIndex = i;
            for(int j=i+1;j<arr.length;j++){
                //we can get the ascending and Descending order of the array by changing the greater and less than  below 
                if(arr[leastValueIndex] < arr[j]){
                    leastValueIndex = j;
                }
            }    
            //Swap technique
                int temp = arr[leastValueIndex];
                arr[leastValueIndex] = arr[i];
                arr[i] = temp;
            
        }
    }
        public static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
    public static void main(String[]args){
        int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        printArray(arr);
    }
}
