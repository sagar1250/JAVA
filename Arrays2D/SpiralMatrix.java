package Arrays2D;

// public class SpiralMatrix {

//     public static void printSpiral(int matrix[][]){
//         //we need to declare 4 variables 
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while(startRow <= endRow && startCol <= endCol){
//             // top
//             for(int j=startCol; j<=endCol;j++){
//                 System.out.print(matrix[startRow][j]+ " ");
//             }
            
//             // Right
//             for(int i = startRow; i<=endRow;i++){
//                 System.out.print(matrix[i][endCol]+ " ");
//             }

//             //bottom
//             for(int j=endCol-1;j>=startCol;j--){
//                 if(startRow == endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j]+ " ");
//             }

//             //left
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+ " ");

//                 startCol++;
//                 startRow++;
//                 endCol--;
//                 endRow--;
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         printSpiral(matrix);
//  }
// }


//package Arrays2D;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        // Declare 4 boundary variables
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row: Left to Right
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++; // Move down

            // Right column: Top to Bottom
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--; // Move left

            // Bottom row: Right to Left
            if (startRow <= endRow) { // Prevent duplicate row traversal
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--; // Move up
            }

            // Left column: Bottom to Top
            if (startCol <= endCol) { // Prevent duplicate column traversal
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++; // Move right
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
}
