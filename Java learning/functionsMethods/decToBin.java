
import java.util.*;

public class decToBin {

    public static void dectobinConverter(int decNum) {
        int org = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum += rem * (int) Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }
        System.out.println("binary of " + org + " = " + binNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number to convert it into binary number : ");
        int decNum = sc.nextInt();
        dectobinConverter(decNum);
    }
}