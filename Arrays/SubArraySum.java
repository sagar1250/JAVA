package Arrays;

public class SubArraySum {

    // this the modification of brute force code for understanding i have added the comments. 

    //prefix based approach
    //logic: prefix[end] - prefix[start-1];
    //logic: prefix[i-1]+numbers[i]

public static void subArraySum(int numbers[]){
    int count  = 0;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];

    //calculating prefix of array
    for(int i=1;i<prefix.length;i++){
        // previous elements sum + current elements sum
        prefix[i] = prefix[i-1]+numbers[i];
    }
    for(int i = 0;i<numbers.length;i++){
        int start = i;
        for(int j=i;j<numbers.length;j++){
            int end = j;
            //sum = 0;
            //here current sum we will be changing 
            // for the first iteration we get the 0; we are starting the start value from 0 then we use some condition
            //ternary operator we are performing ;which means if we are getting -1 then also ignore that and execute till the end

            sum = start ==0? prefix[end] : prefix[end] - prefix[start-1];

            // for(int k = start;k<=end;k++){
            //     sum += numbers[k];
            //     System.out.print(numbers[k]+ " ");
            // }
            System.out.print(sum);
            if(max<sum){
            max = sum;
            }
            count++;
            System.out.println();

        }
        System.out.println();
    }
    System.out.println("count :"+ count + "  Maximum sum :" + max);
}
    public static void main(String[] args){
        int numbers[] = {2, 4, -6, 8, -2, 7};
        subArraySum(numbers);


    }
}
