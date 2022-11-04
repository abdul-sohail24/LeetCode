class Solution 
{
    public int[] findBall(int[][] grid) 
    {
        int ans[] = new int[grid[0].length];
        
        for(int i=0; i<grid[0].length; i++) //DFS
            ans[i] = dropCol(0,i,grid);
        
        return ans;
    }
    
    public int dropCol(int r, int c, int[][] grid)
    {
        //base case
        if(r == grid.length)
            return c;
        
        int nextC = c + grid[r][c];
        if(nextC < 0 || nextC > grid[0].length-1 || grid[r][c] != grid[r][nextC])
            return -1;
            
        return dropCol(r+1, nextC, grid);
    }
}