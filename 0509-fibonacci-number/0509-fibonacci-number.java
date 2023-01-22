class Solution 
{
    public int fib(int n) 
    {
        int[] dp = new int[n+1];
        for(int i=0; i<n+1; i++)
            dp[i] = -1;
        int res = result(n, dp);
        return res;
    }
    
    public int result(int n, int[] dp)
    { 
        if(n <= 1)
            return n;
        if(dp[n] != -1)
            return dp[n];
        dp[n] = result(n-1, dp) + result(n-2, dp);
        return dp[n];
    }
}