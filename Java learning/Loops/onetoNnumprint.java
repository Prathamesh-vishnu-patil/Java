import java.util.*;

public class onetoNnumprint{

    public static void main(String args[]) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print: ");
        int n = sc.nextInt();
        while (count <= n) {
            {
                System.out.println("number is: " + count);
                count++;
            }
        }

        System.out.println("The loop has ended");
    }
}
