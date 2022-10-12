class Solution {
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        
        //Sliding Three Pointer
        for(int i=nums.length - 3; i >=0; i--)
        {
            int C = nums[i+2];
            int B = nums[i+1];
            int A = nums[i];
            
            if(A+B > C)
                return A+B+C;
        }
        
        return 0;
    }
}