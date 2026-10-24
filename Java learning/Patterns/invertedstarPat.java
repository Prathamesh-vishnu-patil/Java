
import java.util.*;

public class invertedstarPat {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines should the inverted star pattern have : ");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            //one line
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
