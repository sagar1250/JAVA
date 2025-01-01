package functions;

import java.util.Scanner;
public class Quest02 {
    // write a method name isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method

    public static Boolean isEven(int num){
        if(num%2 == 0)
            return true;
        
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(isEven(num));
    }
}
