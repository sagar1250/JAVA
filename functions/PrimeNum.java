package functions;

public class PrimeNum {
    public static boolean checkPrimeNumber(int n){

        if(n == 2){
            return true;
        }
       // boolean isPrime = true;
        for(int i = 2;i<=n-1;i++){
            if(n%i == 0){
                //isPrime = false;
               return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(checkPrimeNumber(4));
    }
    
}
