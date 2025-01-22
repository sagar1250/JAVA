package Arrays;
//TC=O(n*2) we have nested loop
public class PrintPairs {
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] +")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int numbers[] = {2, 3, 4, 5, 6, 7, 8};
        printPairs(numbers);
    }
}
