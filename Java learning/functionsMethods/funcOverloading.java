
import java.util.*;

      public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers of sum do you want : ");
        int num = sc.nextInt();
        if (num == 2) {
            System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
            System.out.print(sum(a, b));
        } else if (num == 3) {
            System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
            System.out.print("Enter third number : ");
            int c = sc.nextInt();
            System.out.print(sum(a, b, c));
        }else{
            System.out.print("You can get the sum, upto 3 numbers");
        }
    }
