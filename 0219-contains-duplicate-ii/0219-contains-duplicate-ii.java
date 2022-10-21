class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        //Optimized
        int n = nums.length;
        int first=0, second=0, limit=0;
        Set<Integer> numbers = new HashSet<>();
        
        //Second
        for(int i=0; i<n; i++)
        {
            if(numbers.contains(nums[i]))
            {
                limit = i;
                second = nums[i];
                //First
                for(int j=0; j<limit; j++)
                {
                    if(nums[j] == second)
                    {
                        first = j;
                        if(limit - first <= k)
                            return true;
                    }
                }
        
            }
            else
                numbers.add(nums[i]);
        }
        
        return false;
    }
}