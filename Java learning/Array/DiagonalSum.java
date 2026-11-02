import java.util.*;
public class DiagonalSum{
    public static int diagonalSum(int matrix[][]){
        //O(n^2)
        // int sum = 0;
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
            
        // }
        // return sum;

        //O(n)
        int sum = 0;
        for(int i = 0; i<matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.print("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        IO.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        IO.println("The sum of the diagonals is: " + diagonalSum(matrix));
    }
}