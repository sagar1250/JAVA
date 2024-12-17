package functions;

public class MethodOverloading {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int sum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sum(2, 03));
        System.out.println(sum(3, 04, 5));
    }
}
