class Solution 
{
    //Tabulation (Bottom-Up) [Space Optimized]
    public int fib(int n)
    {
        if(n <= 1)
            return n;
        int prev2 = 0;
        int prev = 1;
        
        for(int i=2; i<n+1; i++)
        {
            int cur_i = prev2+prev;
            prev2 = prev;
            prev = cur_i;
        }
        return prev;
    }
}