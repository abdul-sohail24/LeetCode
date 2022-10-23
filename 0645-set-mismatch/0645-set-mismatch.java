class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int n = nums.length;
        int[] numbers = new int[n];
        
        Set<Integer> unique = new HashSet<>();
        int[] res = new int[2];
        
        for(int i=0; i<n; i++)
        {
            numbers[i] = i+1;
            if(unique.contains(nums[i]))
               res[0] = nums[i]; 
            else
                unique.add(nums[i]);
        }
        
        for(int i=0; i<numbers.length; i++)
        {
            if(!unique.contains(numbers[i]))
                res[1] = i+1;
        }
        
        return res;
    }
}