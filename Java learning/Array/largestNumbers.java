
import java.util.*;
public class largestNumbers{
    public static int findLargest(int numbers[]){
        int large = numbers[0];
        for(int i = 1; i<numbers.length; i++){
            if(large<numbers[i]){
                large = numbers[i];
            }
        }
        return large;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Decide the size of the array : ");
        int size = sc.nextInt();
        if(size<=0){
            System.out.print("The size of array must be greater than zero");
            return;
        }
        int arr[] = new int[size];
        System.out.println("Enter " + size +" numbers:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest number in the array : " + Arrays.toString(arr) + " is : " + findLargest(arr));
    }
}