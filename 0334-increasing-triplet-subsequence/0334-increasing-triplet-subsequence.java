class Solution 
{
    public boolean increasingTriplet(int[] nums) 
    {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        
        //Greedy
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] <= small)
                small = nums[i];
            else if (small <= nums[i] && nums[i] <= big)
                big = nums[i];
            else
                return true;
        }
        
        return false;
    }
}