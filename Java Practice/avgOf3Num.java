
import java.util.*;

public class avgOf3Num{

    public static void avg(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum/3;
        System.out.print("The average of " + a + ", " + b + "and " + c + " is " + avg);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();
        avg(num1,num2,num3);
    }
}