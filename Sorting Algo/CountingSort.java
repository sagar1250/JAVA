package Sorting;

public class CountingSort {
    public static void countingSort(int arr[]){
        //initilizing the largest first
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        // creation the count array to store the frequency
        int count[] = new int[largest + 1];

        //storing the frequency of the orginal array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //we are performing sorting based on the frequency array count

        // initially we initilize one variable to store the orginal array
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {4,2,2,8,3,3,1};
        countingSort(arr);
        for(int count : arr){
            System.out.print(count + " ");
        }
    }
}
