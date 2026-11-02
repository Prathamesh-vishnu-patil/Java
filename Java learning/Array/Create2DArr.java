
import java.util.*;

public class Create2DArr {

    public static boolean search(int matrix[][], int key) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]>max) {
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] == key) {
                    IO.println("Found at index: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        IO.println("Maximum element: " + max);
        IO.println("Minimum element: " + min);
        return found;
    }

    public static void main(String args[]) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        IO.println("The matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                IO.print(matrix[i][j] + " ");
            }
            IO.println();
        }
        IO.println("Enter the key to search: ");
        int key = sc.nextInt();
        IO.println(search(matrix, key));
    }
}
