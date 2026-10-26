
import java.util.*;

public class binomialCoeff {

    public static long findFactorial(int num) {
        long factorial = 1;
        if (num < 0) {
            System.out.println("The factorial is not defined");
        } else if (num == 0) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        if(n<0 || r<0 || r>n){
            System.out.println("The input n = " + n + " and r = " + r + " is invalid");
        }else{
        long binomialCoeff = (findFactorial(n)/(findFactorial(r) * findFactorial(n - r)));
        System.out.println("The binomial coefficient for " + n + "C" + r + " is " + binomialCoeff);
        }
    }
}
