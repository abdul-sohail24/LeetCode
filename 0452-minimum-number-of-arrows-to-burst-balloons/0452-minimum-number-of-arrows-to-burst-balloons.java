class Solution 
{
    public int findMinArrowShots(int[][] points) 
    {
        //Sorting based on ascending order of the end times
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));

        //Pointer + Arrows
        int prev=0, arrows=1;

        //Iterate
        for(int curr=1; curr<points.length; curr++)
        {
            if(points[curr][0] > points[prev][1])
            {
                arrows++;
                prev = curr;
            }
        }

        return arrows;
    }
}
