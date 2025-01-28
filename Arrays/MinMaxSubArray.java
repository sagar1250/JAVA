package Arrays;

public class MinMaxSubArray {
    public static void subArray(int numbers[]){
        int count = 0;
        int max = 0;
        int min = 0;
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end = j;
                int sum = 0;
                for(int k = start;k<=end;k++){

                    // Printing the sum of the sub arrays logic
                    sum = sum + numbers[k];
                    if(sum > max){
                        max = sum;
                    }else{
                        min = sum;
                    }
                    System.out.print(numbers[k]+ " ");
                }
                
                count++;
                //print sub array sum, for each and individual sub array
                System.out.print(" :-"+sum);

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sub Arrays count: "+ count + "   Max :" + max + " Min :"+ min);
    }
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};
        subArray(numbers);
    }
}
