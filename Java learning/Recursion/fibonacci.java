import java.util.*;
//can be optimized by Dynamic Programming
public class fibonacci{ //T.C = O(2^n)  S.C=0(n)
    public static long calcFibonnaci(int n){
        if(n==0 || n==1){
            return n;
        }
        long fnm1 = calcFibonnaci(n-1);
        long fnm2 = calcFibonnaci(n-2);
        long fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.print("Enter your number : ");
        int n = sc.nextInt();
        IO.println(calcFibonnaci(n));
    }
}
