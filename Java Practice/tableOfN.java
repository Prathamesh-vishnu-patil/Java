
import java.util.*;

public class tableOfN {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which table do you want : ");
        int n = sc.nextInt();
        System.out.println("How many iterations do you want in the table : ");
        int i = sc.nextInt();
        for (int j = 1; j <= i; j++) {
            System.out.println(n + "*" + j + "=" + n * j);
        }
    }
}
