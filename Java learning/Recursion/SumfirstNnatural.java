import java.util.*;
public class SumfirstNnatural{
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int sumnmone = sumOfN(n-1);
        int sum = n+sumnmone;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.print("Enter your number : ");
        int n = sc.nextInt();
        IO.println(sumOfN(n));
    }
}