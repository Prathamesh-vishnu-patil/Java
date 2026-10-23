import java.util.*;
public class greaterTwoNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.print(num1 + " is greater than " + num2);
        }else{
            System.out.print(num2 + " is greater than " + num1);
        }
    }
}