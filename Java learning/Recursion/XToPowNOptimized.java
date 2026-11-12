public class XToPowNOptimized{ //T.C = O(log n)
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);

        int halfPowerSq = halfPower * halfPower;
        //n is odd
        if(n%2!=0){
            halfPowerSq *=a;
        }

        return halfPowerSq;
    }
    public static void main(String args[]){
        int a = 2;
        int n = 5;
        IO.println(optimizedPower(a, n));
    }
}