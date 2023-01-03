class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        //Bruteforce(O(logN))
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}