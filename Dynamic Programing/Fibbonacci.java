

public class Fibbonacci {

   
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static int fib(int n){

        if (n<=1) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if (dp[n]!=0) {
            return dp[n];
        }
        else{
            dp[n]=fib(n-1)+fib(n-2);
        }
        return dp[n];
    }
}
