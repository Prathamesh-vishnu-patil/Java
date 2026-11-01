import java.util.*;
public class Insertion {
    public static void InsertionSort(int arr[]) {
        for(int i = 1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            IO.print(arr[i] + " ");
        }
        IO.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter your array size : ");
        int size = sc.nextInt();
        IO.println("Enter your array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
        printArr(arr);
    }
}
