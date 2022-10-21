class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        //Optimized
        int n = nums.length;
        Map<Integer, Integer> numbers = new HashMap<>();
        
        for(int i=0; i<n; i++)
        {
            if(numbers.containsKey(nums[i]))
            {
                if(i - numbers.get(nums[i]) <= k)
                    return true;
                else
                    numbers.put(nums[i], i);
            }
            else
                numbers.put(nums[i], i);
        }
        
        return false;
    }
}