public class SearchSortedMatrix{
    //O(n+m)
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                IO.println("Found at: (" + row + ", " + col + ")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        IO.println("Not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {  {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50} };
        int key = 33;
        IO.println("Searching for: " + key);
        staircaseSearch(matrix, key);
    }
}