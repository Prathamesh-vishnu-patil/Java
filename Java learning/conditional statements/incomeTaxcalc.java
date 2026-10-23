import java.util.*;
public class incomeTaxcalc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        if(income<500000){
            System.out.println("No tax");
        }else if(income>=500000 && income<1000000){
            System.out.println("20% tax is applicable on the income i.e., the total amount to pay :  " + (int)(income+income*0.2));
        }else{
            System.out.println("30% tax is applicable on the income i.e., the total amount to pay :  " + (int)(income+income*0.3));
        }
    }
}