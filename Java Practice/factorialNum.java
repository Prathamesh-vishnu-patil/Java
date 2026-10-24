
import java.util.*;

public class factorialNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want : ");
        int n = sc.nextInt();
        long fact = 1;

        if (n < 0) {
            System.out.println("The factorial is not defined for negative numbers");
        } else if (n == 0) {
            System.out.println("0! = 1");
        } else {
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + fact);
        }
    }
}
