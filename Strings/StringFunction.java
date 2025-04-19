package Strings;

public class StringFunction {
    public static void stringFunction(String str1, String str2){
        
        String str3 = new String("Sagar");

        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }

public static void main(String[] args){
        String str1 = "Sagar";
        String str2 = "Sagar";
        stringFunction(str1, str2);
    }
}