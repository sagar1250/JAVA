package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                //nat a palindrome right
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "amma";
        System.out.println(isPalindrome(str));
    }
}

//time complexcity - 0(n) - linear time complexcity