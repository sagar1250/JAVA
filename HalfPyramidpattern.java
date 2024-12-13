public class HalfPyramidpattern {
    public static void main(String[] args) {
        // to print Half Pyramid Pattern.

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
