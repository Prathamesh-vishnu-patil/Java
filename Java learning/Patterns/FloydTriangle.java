
import java.util.*;

public class FloydTriangle{

    public static void floyd(int rows){
        //outer loop
        int k = 1 ;
        for(int i = 1; i<=rows; i++){
            //print numbers
            for(int j = 1; j<=i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        floyd(rows);
    }
}