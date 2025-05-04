package Strings;


public class StrBuilder {
    public static void main(String[] args){
        // we have created a string bulder and initilized it to  empty/ we can make it to null as well
        StringBuilder sb = new StringBuilder("");
        //here we are running the loop so we  we use .append concept to add elements one by one
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());

    }

}