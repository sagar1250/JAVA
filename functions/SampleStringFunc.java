package functions;

public class SampleStringFunc {
    public static void changeName(String name1){
        name1 = "Sagar Medipelly";  // here we are creating a new object
    }
    public static void main(String[] args){
        String name1 = "Karthik Medipelly";
        changeName(name1);
        System.out.println(name1);

    }
}
