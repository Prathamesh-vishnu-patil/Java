
import java.util.*;

public class sumevenOdd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("Enter numbers to calculate the sum of even and odd numbers (0 to stop): ");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else if (n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
        }
        System.out.println("The sum of even numbers is : " + even);
        System.out.println("The sum of odd numbers is : " + odd);
    }
}
