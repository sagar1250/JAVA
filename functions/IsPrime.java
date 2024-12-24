package functions;

import java.util.*;

public class IsPrime {
    static Boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c  = 2;
        while(c * c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
