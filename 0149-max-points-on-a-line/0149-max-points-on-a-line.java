class Solution 
{
    public int maxPoints(int[][] points) 
    {
        int ans=1, count, n=points.length;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2; 

        for(int i=0; i<n; i++)
        {
            count = 2;
            List<Float> slopes = new ArrayList<>();
            for(int j=0; j<n; j++)
            {
                if(i != j)
                {
                    if(points[j][0] - points[i][0] != 0)
                    {
                        float upper = points[j][1] - points[i][1];
                        float lower = points[j][0] - points[i][0];
                        slopes.add(upper/lower);
                    }
                    if(points[j][0] - points[i][0] == 0)
                    {
                        float num = 0.000001f;
                        slopes.add(num);
                    }
                }
            }
            Collections.sort(slopes);
            for(int k=1; k<slopes.size(); k++)
            {
                if(slopes.get(k).equals(slopes.get(k-1)))
                    count++;
                else
                    count = 2;
                ans = Math.max(ans, count);
            }
        }

        return ans;    
    }
}