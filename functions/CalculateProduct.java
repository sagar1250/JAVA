package functions;

public class CalculateProduct {
    public static int printCalculateProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int prod = printCalculateProduct(a, b);
        System.out.println(prod);
    }
    
}
