class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        //O(N)
        if(nums.length == 1)
            return nums[0];
        for(int i=1; i<nums.length-1; i++)
        {
            int count = 1;
            if(nums[i] == nums[i+1] || nums[i] == nums[i-1])
                count++;
            if(count == 1)
                return nums[i];
        }
        if(nums[nums.length-1] != nums[nums.length-2])
            return nums[nums.length-1];
        else
            return nums[0];
    }
}