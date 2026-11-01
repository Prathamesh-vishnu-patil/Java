import java.util.*;
public class Bubble{
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            int swap = 0;
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap += 1;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            IO.print(arr[i]+" ");
        }
        IO.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter your array size : ");
        int size = sc.nextInt();
        IO.print("Enter your array elements : ");
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        printArr(arr);
    }
}