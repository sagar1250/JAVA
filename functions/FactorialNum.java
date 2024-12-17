package functions;

public class FactorialNum {
    public static int printFactorialNum(int n){
        int fact = 1;
        for(int i=n;i>0;i--){
            fact = fact*i;
            
        }
        return fact;
    }
    public static void main(String[] args){
        System.out.println(printFactorialNum(4));
    }
}
