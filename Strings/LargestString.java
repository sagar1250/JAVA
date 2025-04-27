package Strings;

public class LargestString {
    public static void main(String[] args){
        String fruits[] = {"banana", "mango","grapes"};

        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            //Here we are comparing 2 strings
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
// time complexity 
//  in this copareTo() function will compare the letters of the strings for N strings, which means x-letterlength andd n is n-strings
// O(x * N)
