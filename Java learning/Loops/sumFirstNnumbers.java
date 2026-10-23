
import java.util.*;

public class sumFirstNnumbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the sum of first n numbers: ");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (count <= n) {
            sum += count;
            count++;
        }
        System.out.println("The sum of first " + n + " numbers is: " + sum);
    }
}
