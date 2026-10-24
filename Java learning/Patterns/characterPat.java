
import java.util.*;

public class characterPat {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int line = 0; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
