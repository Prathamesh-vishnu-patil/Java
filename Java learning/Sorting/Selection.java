import java.util.*;
public class Selection {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        printArr(arr);
    }
}
