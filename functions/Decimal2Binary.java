package functions;

public class Decimal2Binary {
    public static void Dec2Bin(int n){
        int myNum = n;
        int pwr = 0;
        int bin = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem * (int)Math.pow(10, pwr));
            pwr++;
            n = n/2;

        }
        System.out.println(bin);

    }
    public static void main(String[] args){
        Dec2Bin(5);
    }
}
