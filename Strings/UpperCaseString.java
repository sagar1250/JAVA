package Strings;

public class UpperCaseString {
    public static String toUpperCase(String str){
        //we will create string builder 
        StringBuilder sb = new StringBuilder("");

        
        //get the first letter and convert to capital - by the below logic line we will get the capitall letter
        char ch = Character.toUpperCase(str.charAt(0));

        // After getting capital letter we try to append 
        sb.append(ch);
        
        for(int i=1;i<str.length();i++){
            //when we reach empty space the next letter should be capital
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                //We are retturning upper case letter
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        //initilised string
        String str = "hi, i am sagar";
        System.out.println(toUpperCase(str));
    }
}
