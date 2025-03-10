package Sorting;

public class BubbleSortP1 {
    public static void bubbleSort(int arr[]){
        //in bubble sort first we try to compare the largest element from the first two elements and move the largest element to the end of the array
        //which means we go till n-2  i.e.., last but one 
        //first we will run the loop till n-1 times 
        for(int turn =0;turn<arr.length-1;turn++){
            //for inner for loop we try to check till the zrr.length - 1 - turn
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] < arr[j+1]){
                    //perform the swap logic 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr);
    }
}
