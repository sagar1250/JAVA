package Patterns;
public class leftTrainglePattern {
    public static void main(String[] args) {
        // to print star pattern, left traingle

        for (int row = 1; row <= 4; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}