package functions;

import java.util.Scanner;

public class Quest03 {
    // write a java program to check if a number is a palindrome in java.
    // eg: 121 is a palindrome,  321 is not.

    // any number is said to palindrome if the given number is equal to the reverse of the actual number.
    
    public static void palindrome(int num){
        // 121
        int orginal = num;
        int reverse = 0;

        while(num>0){
            int rem = num % 10;
            reverse = reverse*10 + rem;
            num = num/10;
        }
        if(reverse == orginal){
            System.out.println(reverse + " :- is Palindrome");
        }else{
            System.out.println(reverse + " :- not Palindrome");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palindrome(num);
    }
}
