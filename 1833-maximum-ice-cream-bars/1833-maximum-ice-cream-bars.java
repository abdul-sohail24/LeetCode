class Solution 
{
    public int maxIceCream(int[] costs, int coins) 
    {
        //Optimized (min-Heap)
        PriorityQueue<Integer> heap = new PriorityQueue();

        for(int i: costs)
            heap.add(i);
        
        int count = 0;
        while(heap.size() > 0 && coins >= heap.peek())
        {
            coins-=heap.remove();
            count++;
        }

        return count;   
    }
}