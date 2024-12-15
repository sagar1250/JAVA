package Patterns;
public class topLeftTrainglePattern1 {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            // n-row+1 is the logic
            for (int star = 4 - row + 1; star > 0; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
