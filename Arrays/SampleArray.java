package Arrays;

public class SampleArray {
    //we can declare array in two ways
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[5];
        String[] str = new String[5];

        System.out.println(arr[2]); // based on the indexing it will givr the output. indexing starts from -> 0 - (n-1)
        System.out.println(arr1[3]); // if we are not giving any values to the arrray then by default it will take zwero by default for integers.
        System.out.println(str[3]); // for String default default value is "null", if no value is initilized for the array.
          

    }
}
