package Sorting;

//in selection sort we are searching for the small element and putting it at the starting of the array
public class SelectionSortP1 {
    public static void selectionSort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int maxPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxPos] > arr[j]){
                    maxPos = j;
                }
            }
            //perform the swap operation
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
        for(int arr1: arr){
            System.out.print(arr1+ " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
    }
}
