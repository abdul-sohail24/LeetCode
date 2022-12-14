class Solution 
{
    public int rob(int[] nums) 
    {
        int last = 0;
        int now = 0;
        int temp;
        for (int n :nums) 
        {
            temp = now;
            now = Math.max(last + n, now);
            last = temp;
        }
        return now;        
    }
}