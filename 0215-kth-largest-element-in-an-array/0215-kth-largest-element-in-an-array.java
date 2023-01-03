class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        //Optimized (Sorting + Max-Heap)
        Arrays.sort(nums);
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b) -> b-a);
        for(int i=0; i<nums.length; i++)
            heap.add(nums[i]);

        for(int i=0; i<k-1; i++)
            heap.remove(nums[nums.length-i-1]);

        return heap.peek();
    }
}