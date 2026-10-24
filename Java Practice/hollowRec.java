import java.util.*;

public class hollowRec {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        for(int line=1; line<=rows; line++){
            for(int star = 1; star<=cols; star++){
                if(line==1 || line == rows){
                    System.out.print("*");
                }else if(line>1 && line<rows){
                    if(star==1 || star==cols){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}