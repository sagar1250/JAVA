package functions;

import java.util.*;
public class ReturnStringValue {
    public static String greetString(String str1, String str2, String str3){
        return str1 + str2 + str3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        System.out.println(greetString(str1, str2, str3));
        


    }
}
