package functions;

import java.util.Scanner;

public class Quest01 {
    // Write a java program to compute the average of three numbers.

    //three numbers -> average

    public static int numsAverage(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input three numbers to calculate average");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //int avg = numsAverage(a, b, c);
        System.out.print(numsAverage(a, b, c));

    }
}
