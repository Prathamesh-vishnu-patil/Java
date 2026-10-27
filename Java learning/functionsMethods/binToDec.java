
import java.util.*;

public class binToDec {

    public static void bintodecConverter(int binNum) {
        int org = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        System.out.println("decimal of " + org + " = " + decNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number to convert it into decimal number : ");
        int binNum = sc.nextInt();
        bintodecConverter(binNum);
    }
}
