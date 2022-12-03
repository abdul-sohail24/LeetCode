class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        int k=0;
        double ans = 0.00;
        
        for(int i=0; i<m; i++)
            nums[i] = nums1[i];
        
        for(int j=m; j<m+n; j++)
        {
            nums[j] = nums2[k];
            k++;
        }
        
        Arrays.sort(nums);
        
        int len = nums.length;
        if(len%2 != 0)
            ans = (double)nums[(len+1)/2 - 1];
        else
            ans = (double)((nums[len/2] + nums[(len/2) - 1])/2.00);
        
        return ans;
    }
}