package functions;

import java.util.*;

public class VarArg {
    public static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args){
        fun("sagar", "karthik", "Hello All");

    }
}
