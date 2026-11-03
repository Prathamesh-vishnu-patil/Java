import java.util.*;
public class charTraverseString{
    public static void traverseString(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a string to traverse: ");
        String str = sc.nextLine();
        traverseString(str);
    }
}