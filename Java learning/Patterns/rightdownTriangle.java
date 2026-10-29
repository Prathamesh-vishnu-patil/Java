import java.util.*;

public class rightdownTriangle{

    public static void inverted_rotated_halfpyramid (int rows){
        //outer-loop
        for(int i = 1; i<=rows; i++){
            //Spaces
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        inverted_rotated_halfpyramid(rows);
    }
}