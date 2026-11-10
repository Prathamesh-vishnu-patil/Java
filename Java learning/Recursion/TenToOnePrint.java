class TenToOnePrint {
    public static void printDec(int n){
        if(n==1){ //base case
            IO.println(n);
            return;
        }
        IO.print(n+" ");
        printDec(n-1); //recursively calling itself
    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);
    }
}  