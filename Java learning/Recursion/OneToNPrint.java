import java.util.*;
public class OneToNPrint{
    public static void printIncr(int n){
        if(n==1){
            IO.print(1 + " ");
            return;
        }
        printIncr(n-1);
        IO.print(n+ " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.print("Enter your number : ");
        int n = sc.nextInt();
        printIncr(n);
    }
}