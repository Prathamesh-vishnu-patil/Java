
import java.util.*;

public class sumdigits {

    public static void sumOfDigitscalc(int n) {
        int sum = 0;
        int org = n;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println("The sum of the digits of the number " + org + " is " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sumOfDigitscalc(num);
    }
}
