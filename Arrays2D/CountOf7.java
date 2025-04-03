package Array2D;

public class CountOf7 {
    public static void countOf7(int matrix[][]){
        int countOf7 = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 7){
                    countOf7++;
                }
            }
        }
        System.out.println("repeated count of a number in the matrix is: "+ countOf7);
    }
    public static void main(String[] args){
        int matrix[][] = {{4,6,7},{5,2,7}};
        countOf7(matrix);
    }
}
