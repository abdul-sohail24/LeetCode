class Solution 
{
    public int minStoneSum(int[] piles, int k) 
    {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a); //Max Heap
        for(int i=0; i<piles.length; i++)
            heap.add(piles[i]); //Adding all elements in Heap
        
        for (int i=0; i<k; i++) 
        {
            int curr = heap.remove();
            if(curr%2 == 1)
                heap.add(curr/2 + 1);
            else
                heap.add(curr/2);
        }
        
        int ans = 0;
        for (int num: heap)
            ans += num;
        
        return ans;
    }
}