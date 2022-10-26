class Solution 
{
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        //Optimized
        int n = nums.length;

        int[] prefix_sum = new int[n + 1];
        for (int i = 1; i <= n; i++)
            prefix_sum[i] = prefix_sum[i-1] + nums[i-1];
        
        Set<Integer> set = new HashSet<>();
        for (int i=2; i <=n; i++) 
        {
            int remainder_i = prefix_sum[i];
            int remainder_j = prefix_sum[i-2] % k;
            set.add(remainder_j % k);
            if (set.contains(remainder_i % k)) 
                return true;
        }

        return false;
    }
}