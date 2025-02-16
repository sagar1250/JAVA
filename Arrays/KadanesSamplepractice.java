package Arrays;

public class KadanesSamplepractice {
    public static void kadanes(int numbers[]){
        int cs=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            maxSum=Math.max(cs, maxSum);
        }
        System.out.println("The maximum subArray sum is: " + maxSum);
    }
    public static void main(String[] args){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
