package functions;

import java.util.*;
public class swap {
    public static void printSwap(int a, int b){
        int temp = a;
        a =  b;
        b = temp;
        //return a;
       System.out.println(a +" "+b);
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int temp;
         int a = sc.nextInt();
         int b = sc.nextInt();

        // temp = a;
        // a = b;
        // b = temp;
        printSwap(a, b);
        
        
    }
}
