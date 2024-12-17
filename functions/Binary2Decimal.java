package functions;

public class Binary2Decimal {
    public static void printBinary(int n){
        int myBinary = n;
        int pwr = 0;
        int dec = 0;
        while(n>0){
         int lastDigit = n%10;
        dec = dec + (lastDigit + (int)Math.pow(2, pwr));
        pwr++;
        n = n/10;
        }
        System.out.println("the binary value is "+ myBinary + " the decimal value is "+ dec);
    }
    public static void main(String[] args){
        printBinary(101);
    }
}
