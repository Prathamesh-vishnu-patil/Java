import java.util.*;
public class InbuiltSort{
    public static void main(String args[]){
        Integer arr[] = {6,3,5,2,1};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0; i<arr.length; i++){
            IO.print(arr[i]+" ");
        }
        IO.println();
    }
}