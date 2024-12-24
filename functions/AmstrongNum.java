package functions;
import java.util.*;

public class AmstrongNum {

    public static boolean amstrongNum(int a){
        int a1 = a;
            int sum = 0;
        while(a>0){
            int rem = a%10;
            sum+=rem*rem*rem;
             a = a/10;
        }
        return sum == a1;
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(amstrongNum(a));

        for(int i = 100;i < 999;i++){
            if(amstrongNum(i)){
                System.out.println(i+ " ");
            }
        }
        
    }
}
 