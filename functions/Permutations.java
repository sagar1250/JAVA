package functions;

public class Permutations {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomialCoEff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int coeff = fact_n/(fact_nmr*fact_r);

        return coeff;
    }
    public static void main(String[] args){
        System.out.println(binomialCoEff(5, 2));
    }
}
