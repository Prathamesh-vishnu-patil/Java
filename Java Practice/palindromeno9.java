
import java.util.*;

public class palindromeno9 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a palindrome or not : ");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("false");
        }

        int org = x;
        int rev = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x / 10;
        }

        if (org == rev) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
