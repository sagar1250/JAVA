package functions;

import java.util.*;

public class SumFunction {
    public static int printSumFunction(int num1, int num2) {
        // int sum = 0;
        int sum = num1 + num2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = printSumFunction(a, b);
        System.out.println("Sum is : " + sum);
    }
}
