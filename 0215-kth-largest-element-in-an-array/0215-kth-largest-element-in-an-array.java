class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        //Optimized (Max-Heap)
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b) -> b-a);
        for(int i=0; i<nums.length; i++)
            heap.add(nums[i]);

        for(int i=0; i<k-1; i++)
            heap.poll();

        return heap.peek();
    }
}