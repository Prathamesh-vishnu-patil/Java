public class ClearIthbit{
    public static int clearIthbit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String args[]){
        IO.print(clearIthbit(10, 1));
    }
}