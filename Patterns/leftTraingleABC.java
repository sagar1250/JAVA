package Patterns;

public class leftTraingleABC {
    public static void main(String[] args){
        char ch = 'A'; 

    // to print A,BC, DEF,GHIJ
        for(int row =1;row<=4;row++){
            for(int colm=1;colm<=row;colm++){
                System.out.print(ch+" ");
                ch++;

            }
            System.out.println();
        }
    }
}
