package functions;

public class DataTypeOverload {
    //integer return function
    public static int sum(int a, int b){
        return a+b;
    }

    //float return function
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(2, 01));
        System.out.println(sum(1.8f, 2.2f));

    }
}
