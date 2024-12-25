package Arrays;

import java.util.*;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            //System.out.println(arr[i]); 
        }
         // for each loop        
        for(int num:arr){ // for every element in the aray print element
            System.out.println(num);// here num represents element of the array.
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
