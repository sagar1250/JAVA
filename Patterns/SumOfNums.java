package functions;

import java.util.Scanner;
public class SumOfNums {
    public static int printSumOfNums(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printSumOfNums(a, b));
        sc.close();

    }
}
