package Arrays;

public class LargestSmallestNum {
    public static int largeSmallNum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        //This logic is for finding the largest element.

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in the array is: " +smallest);
        return largest;
    }
    public static void main(String[] args){
        int numbers[] = {2, 3, 4, 6, 1, 5};
        System.out.println(largeSmallNum(numbers));
    }
}
