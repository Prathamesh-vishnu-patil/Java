
import java.util.*;

public class factorialNum {

    public static void findFactorial(int num) {
        long factorial = 1;
        if (num < 0) {
            System.out.println("The factorial is not defined for " + num);
        } else if (num == 0) {
            System.out.println("0! = 1");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
                System.out.print(i);
                if (i < num) {
                    System.out.print("*");
                }
            }
            System.out.print("=" + factorial);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial : ");
        int num = sc.nextInt();
        findFactorial(num);
    }
}
