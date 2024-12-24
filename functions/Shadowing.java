package functions;

public class Shadowing {
    static int x = 90; // this will be showed at any scope if they re create varailble 
    static void fun(){
        System.out.println(x);

        int x = 99;
        System.out.println(x);

    }
    public static void main(String[] args){
        System.out.println(x);
        fun();
    }

    
}
