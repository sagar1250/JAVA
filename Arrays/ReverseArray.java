package Arrays;

public class ReverseArray {
    public static void reverse(int numbers[]){
        int firstVal=0;
        int lastVal=numbers.length-1;
        while(firstVal < lastVal){
            int temp = numbers[lastVal];
            numbers[lastVal] = numbers[firstVal];
            numbers[firstVal] = temp;
            firstVal++;
            lastVal--;
        }
    }
    public static void main(String[] args){
        int numbers[] = {2, 6, 5, 3, 8, 9};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
