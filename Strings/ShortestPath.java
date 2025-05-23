package Strings;

public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0, y=0;
        //Here we are using path.length() because we are using string and to get the lenfth of the string
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        //Done type casting form int to float
        return (float)Math.sqrt(x2 + y2);
    }
public static void main(String[] args){
    String path = "WNEENESENNN";
    System.out.println(getShortestPath(path));
  }
}


Time Complexity: O(n)
    
