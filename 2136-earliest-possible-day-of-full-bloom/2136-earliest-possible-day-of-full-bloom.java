class Solution 
{
    public int earliestFullBloom(int[] plantTime, int[] growTime) 
    {
        int n = growTime.length;
        List<Integer> indices = new ArrayList<>();
        
        for (int i = 0; i < n; ++i)
            indices.add(i);
        
        Collections.sort(indices, Comparator.comparingInt(i -> -growTime[i]));

        int result = 0;
        int curPlantTime = 0;
        
        for (int i=0; i<n; i++) 
        {
            int index = indices.get(i);
            int time = curPlantTime + plantTime[index] + growTime[index];
            result = Math.max(result, time);
            curPlantTime += plantTime[index];
        }
        
        return result;
    }
}