public class topLeftTrainglePattern {
    public static void main(String[] args) {
        // to print top left Triangle

        for (int row = 4; row > 0; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
