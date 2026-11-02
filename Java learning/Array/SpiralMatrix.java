import java.util.*;
public class SpiralMatrix{
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j =startCol; j<=endCol; j++){
                IO.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i = startRow+1; i<=endRow; i++){
                IO.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int j = endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                IO.print(matrix[endRow][j] + " ");
            }

            //left
            for(int i = endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                IO.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        IO.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.print("Enter the number of rows: ");
        int n = sc.nextInt();
        IO.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        IO.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        IO.println("The spiral order of the matrix is: ");
        printSpiral(matrix);
    }
}