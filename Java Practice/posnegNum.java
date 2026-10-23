import java.util.*;

//Conditional Statements Q.1

public class posnegNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is positive or negative");
        int num1 = sc.nextInt();
        String posOrNeg = (num1>0) ? ("Postive") : "Negative";
        System.out.println("The number is " + posOrNeg);
    }
}  