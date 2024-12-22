package functions;

import java.util.Arrays;

public class StringValueChange {
    public static void change(int[] arr){
        // for premitive datatypes :- These are just like pass by value.
        // when it comes to Objects and Strings its basically passed by value of the reference.
        arr[0] = 999; // if make change by a object by a  reference variable, same object will be changed.(the orginal object value will be changed)

    }
    public static void main(String[] args){
        int[] num = {1, 2, 3, 4};
        change(num);
        System.out.println(Arrays.toString(num));
    }
}
