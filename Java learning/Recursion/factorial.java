public class factorial{ //T.C = O(n),   S.C = O(N)
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n = 4;
        IO.println(fact(n));
    }
}