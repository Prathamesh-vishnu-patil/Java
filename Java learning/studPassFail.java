import java.util.*;
public class studPassFail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String passfail = (marks>=33) ? "pass" : "fail";
        System.out.print("Student has " + passfail + " the exam");
    }
}