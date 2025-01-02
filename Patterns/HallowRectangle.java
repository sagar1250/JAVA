package Patterns;

import java.util.Scanner;

public class HallowRectangle {
    public static void totStars(int totRows, int totColms){     
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totColms;j++){
                if(i == 1 || i == totRows || j == 1 || j == totColms){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row number & Column number to get Hallown Rectangular matrix: ");
        int totRows = sc.nextInt();
        int totColms = sc.nextInt();
        totStars(totRows, totColms);
    }
}
