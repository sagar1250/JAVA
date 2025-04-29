package Strings;

public class StringObject {
    public static void main(String[] args){
        String str1 = "tony";
        String str2 = "tony";
        String str3 = new String("tony");
        // here two strings are refereng to the same object
        // which means in stack it creates two variable str1 & str2 anf in the heap it creats a single object and refer the same object reference variable to the two variables in the stack

        if(str1 == str2){}
        System.out.println("Equal strings");
        // when we come to the below  logic we are ceating a new object with new key word and pointing to the dofferent object when the both the values are same but they are refeening to the different object and have the different address location in the stack
         if(str2 == str3){
            System.out.println("Not Equal");
        }
        System.out.println("Exit");
    }
}
