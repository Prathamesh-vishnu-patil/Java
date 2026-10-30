public class LinearSearch{

    public static int linear_search(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16};
        int key = 43;
        int res = linear_search(arr, key);
        if(res==-1){
            System.out.println("The element is not present in the array");
        }else{
            System.out.println("The element is present on the index " + res);
        }
    }
}