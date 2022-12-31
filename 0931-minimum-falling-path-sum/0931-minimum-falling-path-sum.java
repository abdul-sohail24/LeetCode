class Solution 
{
    public int minFallingPathSum(int[][] A) 
    {
        int n = A.length;
        for (int i = 1; i < n; ++i)
            for (int j = 0; j < n; ++j)
                A[i][j] += Math.min(A[i - 1][j], Math.min(A[i - 1][Math.max(0, j - 1)], A[i - 1][Math.min(n - 1, j + 1)]));
        return Arrays.stream(A[n - 1]).min().getAsInt();
    }        
}