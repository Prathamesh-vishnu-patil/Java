import java.util.*;
public class StrPalindrome{
    public static boolean isPalindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.print("Enter a string to check if it is palindrome or not: ");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            IO.println(str + " is a palindrome");
        }else{
            IO.println(str + " is not a palindrome");
        }
    }
}