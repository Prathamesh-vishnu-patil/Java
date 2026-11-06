public class SetIthbit{
    public static int setIthbit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String args[]){
        IO.print(setIthbit(5, 1));
    }
}