public class EvenOdd{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            //even number
            IO.println("even number");
        }else{
            IO.println("odd number");
        }
    }
    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(48); 
    }
}