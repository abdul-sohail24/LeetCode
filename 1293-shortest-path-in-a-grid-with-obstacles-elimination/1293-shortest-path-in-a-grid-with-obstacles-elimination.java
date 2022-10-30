class Solution 
{
    public int shortestPath(int[][] grid, int k) 
    {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}}; //right,down,left,up
        boolean[][][] visited = new boolean[m][n][k+1];
        Queue<int[]> q = new LinkedList<>();
        
        int steps = 0;
        int[] initial = {0,0,k};
        q.offer(initial);
        
        //BFS
        while(!q.isEmpty())
        {
            int size = q.size();
            
            //Iterate through each cell present in queue
            while(size-- > 0)
            {
                int[] curr = q.poll();
                //Base Case
                if(curr[0] == m-1 && curr[1] == n-1)
                    return steps;
                //Traverse in all valid directions from the present cell
                for(int x=0; x<4; x++)
                {
                    //getting the trio of the next cell
                    int i = curr[0] + directions[x][0];
                    int j = curr[1] + directions[x][1];
                    int obstacle = curr[2];
                    
                    //Traversing from the next cell to all valid cells
                    if(i >= 0 && i < m && j >= 0 && j<n)
                    {
                        if(grid[i][j] == 0 && !visited[i][j][obstacle]) //no obstacle in the way
                        {
                            int[] valid_cell = {i,j,obstacle};
                            q.offer(valid_cell);
                            visited[i][j][obstacle] = true;
                        }
                        else if(grid[i][j] == 1 && obstacle > 0 && !visited[i][j][obstacle]) //obstacle present
                        {
                            int[] valid_cell = {i,j,obstacle-1};
                            q.offer(valid_cell);
                            visited[i][j][obstacle] = true;
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
} 