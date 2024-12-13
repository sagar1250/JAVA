public class topLeftTrainglePattern2 {

    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            // n-row+1 is the logic we put it in the condition is the other way
            for (int star = 1; star <= (4 - row + 1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
