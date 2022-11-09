class Solution {
    public int maxSubArray(int[] nums) 
    {
        //O(N) Kaden's Algorithm
        int maxi = nums[0], summ = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(summ < 0)
                summ = 0;
            summ +=  nums[i];
            maxi = Math.max(summ, maxi);
        }
        return maxi;
    }
}