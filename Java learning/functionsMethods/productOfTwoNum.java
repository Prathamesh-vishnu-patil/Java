
import java.util.*;

public class productOfTwoNum {

    public static void multiply(int a, int b) {
        int product = a * b;
        System.out.println("The product of " + a + " and " + b + " is " + product);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        multiply(a, b);
    }
}
