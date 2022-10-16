class Solution 
{
    public int minDifficulty(int[] jobDifficulty, int d) 
    {
        int n = jobDifficulty.length;
        if(n < d)
            return -1;
        int[][] dp = new int[d+1][n];
        for(int i=0; i<d+1; i++)
        {
            for(int j=0; j<n; j++)
            {
                dp[i][j] = -1;
            }
        }
        int ans = dfs(jobDifficulty, d, dp, 0);
        return ans;
    }
    
    public int dfs(int[] jobDifficulty, int d, int[][] dp, int index)
    {
        int n = jobDifficulty.length;
        if(d == 1) //base case
        {
            int maxi = 0;
            while(index < n)
                maxi = Math.max(maxi, jobDifficulty[index++]); 
            return maxi;
        }
        if(dp[d][index] != -1)
            return dp[d][index];
        int maxi = 0;
        int res = Integer.MAX_VALUE;
        for(int i=index; i<n-d+1; i++)
        {
            maxi = Math.max(maxi, jobDifficulty[i]);
            res = Math.min(res, maxi + dfs(jobDifficulty, d-1, dp, i+1));
        }
        return dp[d][index] = res;
    }
}